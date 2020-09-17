
public class C10E13MyRectangle2D {

	private double x;
	private double y;
	private double width;
	private double height;
	
	public C10E13MyRectangle2D() {
		this.setX(0);
		this.setY(0);
		this.setWidth(1);
		this.setHeight(1);
	}
	
	public C10E13MyRectangle2D(double x, double y,double width,double height) throws IllegalAccessException {
		this.x = x;
		this.y = y;
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2.0 * (this.width + this.height);
	}
	
	public boolean contains(double x, double y) {
		return ((x >= this.x - this.width / 2) && (x <= this.x + this.width / 2) &&
				(y >= this.y - this.height /2 ) && ( y <= this.y + this.height /2));
	}
	
	public boolean contains(C10E13MyRectangle2D r) {
		double x1 = r.getX() - r.getWidth() * 0.5;
		double x2 = r.getX() + r.getWidth() * 0.5;
		double y1 = r.getY() - r.getHeight() * 0.5;
		double y2 = r.getY() + r.getHeight() * 0.5;
		//check if 4 corner points of r are all contained in this rectangular
		return (this.contains(x1,y1) && this.contains(x1,y2) 
				&& this.contains(x2,y1) && this.contains(x2,y2));
		
	}


	private boolean outside(C10E13MyRectangle2D r) {
		double x1 = r.getX() - r.getWidth() * 0.5;
		double x2 = r.getX() + r.getWidth() * 0.5;
		double y1 = r.getY() - r.getHeight() * 0.5;
		double y2 = r.getY() + r.getHeight() * 0.5;
		return (x2 <= this.x - this.width / 2)
				||( x1 >= this.x + this.width /2)
				||( y2 <= this.y - this.height /2)
				||( y1 >= this.y + this.height /2);
				
	}

	private boolean outside(double x, double y) {
		return  !this.contains(x,y);

	}
	
	public boolean overlaps(C10E13MyRectangle2D r) {
		double x1 = r.getX() - r.getWidth() * 0.5;
		double x2 = r.getX() + r.getWidth() * 0.5;
		double y1 = r.getY() - r.getHeight() * 0.5;
		double y2 = r.getY() + r.getHeight() * 0.5;
	
		return (! r.contains(this)) && (!this.outside(r)) && (this.outside(x1,y1) || this.outside(x1,y2) || this.outside(x2,y1) || this.outside(x2,y2)); 
	}
	private double getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	public boolean isValid(double d) {
		return d > 0;
		
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) throws IllegalArgumentException{
    	if(height > 0)
    		this.height = height;
    	else
    		throw new IllegalArgumentException("Height cannot be negative.");
    }

    public void setWidth(double width) throws IllegalArgumentException{
    	if(width >0)
    		this.width = width;
    	else
    		throw new IllegalArgumentException("Width cannot be negative.");
    }

}

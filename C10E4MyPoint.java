
public class C10E4MyPoint {
	private double x, y;

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}


	public void setY(double y) {
		this.y = y;
	}

	public C10E4MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public C10E4MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
    public double distance(C10E4MyPoint point) {
    	double x1 = this.x;
    	double x2 = point.getX();
    	double y1 = this.y;
    	double y2 = point.getY();
    	Double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		Double distance = Math.pow(a, 0.5);
		
		return distance;
    }
    
    public double distance(double x2, double y2) {
    	Double a = (x2 - x) * (x2 - x) + (y2 - y) * (y2 - y);
		Double distance = Math.pow(a, 0.5);
    	return distance;
    }
	public double getY() {
		return y;
	}

	public double getX() {
		return x;
	}

}


public class C11E1Triangle extends SimpleGeometricObject {

	private double side1, side2,side3;
	//private String errorMessage = "";
	public C11E1Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	public C11E1Triangle(double side1, double side2,double side3) throws IllegalTriangleException {
		
		try {
			this.setSide1(side1);
			this.setSide2(side2);
			this.setSide3(side3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
		if(!this.isValid()) 
			throw new IllegalTriangleException("Illegal.The sum of any two sides must be greater than the third. ");
		
	}
	
	public double getArea() {
		Double s = (side1 + side2 + side3) / 2.0;
		Double temp = s * (s - side1) * (s - side2) * (s - side3);
		Double area = Math.pow(temp, 0.5);
		return area;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

	}
	
	public boolean isValid() {
		return (side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side1 + side2);
	}

	/**
	 * @param side1 the side1 to set
	 * @throws IllegalArgumentException 
	 */
	public void setSide1(double s) {
		if(isValid(s)) {
			this.side1 = s;
		}else {
			throw new IllegalArgumentException("Side must  be positive.");
		}
	}
	
	public void setSide2(double s)  {
		if(isValid(s)) {
			this.side2 = s;
		}else {
			throw new IllegalArgumentException("Side must  be positive.");
		}
	}
	
	public void setSide3(double s)  {
		if(isValid(s)) {
			this.side3 = s;
		}else {
			throw new IllegalArgumentException("Side must  be positive.");
		}
	}
	private boolean isValid(double s) {
		return s > 0;
	}
	/**
	 * @param side2 the side2 to set
	 */
	

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

}

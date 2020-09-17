
public class C9E11LinearEquation {
	private double a,b,c,d,e,f;
	
	public C9E11LinearEquation(double a, 
			double b,double c, double d, double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		
	}
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void setD(double d) {
		this.d = d;
	}

	public void setE(double e) {
		this.e = e;
	}

	public void setF(double f) {
		this.f = f;
	}

	public boolean isSolvable() {
		if(a * d - b * c == 0) 
			return false;
		else 
			return true;	
	}
	
	public double getX() throws Exception {
		if(!isSolvable()) {
			throw new Exception(" ad - bc cannot be zero.");
		}
			return (e * d - b * f) / (a * d - b * c);
		
	}
	public double getY() throws Exception {
		if(!isSolvable()) {
			throw new Exception(" ad - bc cannot be zero.");
		}
	
		return (a * f - e * c) / (a * d - b * c);
	}



}

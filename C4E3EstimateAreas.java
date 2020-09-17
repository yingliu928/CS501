
public class C4E3EstimateAreas {
	static double  R = 6371.01;
	public static void main(String[] args) {
		// Latitude, Longtitude
		//Atlanta, Georgia:33.748550 , -84.391500
		double x1 = 33.748550;
		double y1 = -84.391500;
		//Orlando, Florida,USA 28.538330, -81.090100
		double x2 = 28.538330;
		double y2 = -81.090100;
		//Savannah, Georgia 32.0809263,-81.0911768
		double x3 = 32.0809263;
		double y3 = -81.0911768;
		//Charlotte, North Carolina 35.223790, -80.841140
		double x4 = 35.223790;
		double y4 = -80.841140;
		
		//Calculate distance between Altanta - Orlando
		double s1 = distanceCalculate(x1,y1,x2,y2);
		System.out.println("The distance(km) of Atalanta - Orlando: " + s1);
		//Calculate distance between Orlando - Savannah
		double s2 = distanceCalculate(x2,y2,x3,y3);
		System.out.println("The distance(km) of Orlando - Savannah: " + s2);
		//Calculate distance between Atlanta - Savannah
		double s3 = distanceCalculate(x1,y1,x3,y3);
		System.out.println("The distance(km) of Atlanta - Savannah: " + s3);
		////Calculate distance between Charlotte - Savannah
		double s4 = distanceCalculate(x3,y3,x4,y4);
		System.out.println("The distance(km) of Savannah - Charlotte: " + s4);
		//Calculate distance between Atalanta - Charlotte
		double s5 = distanceCalculate(x4,y4,x1,y1);
		System.out.println("The distance(km) of Atalanta - Charlotte: " + s5);
		System.out.println();
		
		//Area of the first triangle
		double area1 = areaCalculate(s1,s2,s3);
		System.out.println("The area of the first triangle(Orlando - Savannah - Atalanta) is: " + area1 + " square kilometer");
		//Calculate distance between Savannah - Charlotte
		
		double area2 = areaCalculate(s4,s5,s3);
		System.out.println("The area of the second triangle(Charlotte - Savannah - Atalanta) is: " + area2  + " square kilometer");
		double area = area1 + area2;
		System.out.println();
		System.out.println("The estimate area of these four cities is: " + area + " square kilometer");
	
	}
	
	
	// x1,y1 are the latitude and longitude or the first point;
	// x2,y2 are the latitude and longitude of the second point
	 public static double distanceCalculate(double x1, double y1, double x2, double y2) {
		 	double sinx1 = Math.sin(Math.toRadians(x1));
			double sinx2 = Math.sin(Math.toRadians(x2));
			double cosx1 = Math.cos(Math.toRadians(x1));
			double cosx2 = Math.cos(Math.toRadians(x2));
			double cosy1y2 = Math.cos(Math.toRadians(y1-y2));
			double d = R * Math.acos(sinx1 * sinx2 + cosx1 * cosx2 * cosy1y2);
			
			return d;
	 }
	 
	 public static double areaCalculate(double side1, double side2, double side3) {
		 Double s = (side1 + side2 + side3) / 2.0;
		 Double temp = s * (s - side1) * (s - side2) * (s - side3);
		 Double area = Math.sqrt(temp);
		 
		 return area;
	 }

}

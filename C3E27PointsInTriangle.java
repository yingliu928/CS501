import java.util.Scanner;

public class C3E27PointsInTriangle {
	static double X1 = 200;
	static final double Y1 = 0;
	static final double X2 = 0;
	static final double Y2 = 100;
	

	public static void main(String[] args) {
		
		System.out.println("Enter a point's x- and y-coordinates:");
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		if((x > X2 && x < X1) && ( y > Y1 && y < Y2 - 0.5 * x ))
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
			
	}

}

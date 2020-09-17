import java.util.Scanner;

public class C3E3SolveLinearEquation {
	

	public static void main(String[] args) {
		System.out.println("Enter a, b, c, d, e, f: ");
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		in.close();
		if(a * d - b * c == 0) {
			System.out.println("The equation has no solution");
			
		}else {
			double x = ( e * d - b * f ) / ( a * d - b * c );
			double y = ( a * f - e * c ) / ( a * d - b * c );
			System.out.println("x is " + x + " and y is " + y);
			
		}
	}

}

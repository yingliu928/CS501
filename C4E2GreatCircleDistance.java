import java.util.Locale;
import java.util.Scanner;

public class C4E2GreatCircleDistance {
	static double  R = 6371.01;
	public static void main(String[] args) {
		double x1 = 0.0;
		double x2 = 0.0;
		double y1 = 0.0;
		double y2 = 0.0;
				
		
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		
		in.useDelimiter("(\\s|,)+");
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		in.nextLine();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		
		in.close();
		double sinx1 = Math.sin(Math.toRadians(x1));
		double sinx2 = Math.sin(Math.toRadians(x2));
		double cosx1 = Math.cos(Math.toRadians(x1));
		double cosx2 = Math.cos(Math.toRadians(x2));
		double cosy1y2 = Math.cos(Math.toRadians(y1-y2));
		
		double d = R * Math.acos(sinx1 * sinx2 + cosx1 * cosx2 * cosy1y2);
		System.out.println("The distance between the two points is " + d + " km");

	}

}

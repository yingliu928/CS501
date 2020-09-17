import java.util.Locale;
import java.util.Scanner;

public class C9E12IntersectingPoint {

	public static void main(String[] args)  {
		double X,Y,a,b,c,d,e,f,x1,y1,x2,y2,x3,y3,x4,y4;
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		in.useDelimiter("(\\s|,)+");
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		x3 = in.nextDouble();
		y3 = in.nextDouble();
		x4 = in.nextDouble();
		y4 = in.nextDouble();
		
		in.close();
		a = y1 - y2;
		b = -(x1 - x2);
		c = y3 - y4;
		d = -(x3 - x4);
		e = (y1 - y2) * x1 - (x1 - x2) * y1;
		f = (y3 - y4) * x3 - (x3 - x4) * y3;
	
		C9E11LinearEquation eq = new C9E11LinearEquation(a,b,c,d,e,f);
	
		   try {
			X = eq.getX();
			Y = eq.getY();
			System.out.println("The intersecting point is: (" + X + ", " + Y + ").");
		} catch (Exception e1) {
			
			System.out.println("The two lines are parallel");
		}
	

	}

}

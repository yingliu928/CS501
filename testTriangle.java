import java.util.Locale;
import java.util.Scanner;

public class testTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input 3 sides of the triangle:");
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		
		in.useDelimiter("(\\s|,)+");
		double s1 = in.nextDouble();
		double s2 = in.nextDouble();
		double s3 = in.nextDouble();
		in.close();
		C11E1Triangle t1 = new C11E1Triangle();
	}

}

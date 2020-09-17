import java.util.Locale;
import java.util.Scanner;

public class C10E4testMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		while (flag) {
			Scanner in = new Scanner(System.in);
			in.useLocale(Locale.US);
			in.useDelimiter("(\\s|,+)");
			System.out.println("please input x1,y1 of point1:");
			double x1;
			double y1;
			try {
				x1 = in.nextDouble();
				y1 = in.nextDouble();
				in.nextLine();
				C10E4MyPoint point1 = new C10E4MyPoint(x1, y1);
				System.out.println("please input x2,y2 of point2:");
				double x2;
				double y2;
				try {
					x2 = in.nextDouble();
					y2 = in.nextDouble();
					in.nextLine();
					// C10E4MyPoint point2 = new C10E4MyPoint(x2,y2);
					double distance = point1.distance(x2, y2);
					System.out.println("The distance between this two points is: " + distance);
					System.out.println("Continue? Y/N");
					String s = in.nextLine();
					char c = s.charAt(0);
					if (c == 'y' || c == 'Y') {
						continue;
					} else {
						in.close();
						break;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Input is not valid");
					continue;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Input is not valid");
			}
		}
	}
}

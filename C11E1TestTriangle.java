import java.util.Locale;
import java.util.Scanner;

public class C11E1TestTriangle {

	public static void main(String[] args) {
		boolean flag1 = true;
		while (flag1) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter three sides of the triangle: ");

			in.useLocale(Locale.US);
			in.useDelimiter("(\\s|,+)");
			double side1;
			double side2;
			double side3;

			try {
				side1 = in.nextDouble();
				side2 = in.nextDouble();
				side3 = in.nextDouble();
				in.nextLine();

				try {
					C11E1Triangle t1 = new C11E1Triangle(side1, side2, side3);
					System.out.println("Please set the color:");
					String s = in.nextLine();
					t1.setColor(s);
					System.out.println("Is the color filled? Y/N");
					String fill = in.nextLine();

					char c = fill.charAt(0);
					if (c == 'y' || c == 'Y') {
						t1.setFilled(true);
					} else if (c == 'n' || c == 'N') {
						t1.setFilled(false);
					} else {
						System.out.println("Invalid input. ");
					}
					System.out.println("Triangle created.");
					System.out.printf("The three sides are: %2f, %2f, %2f \n", side1, side2, side3);
					System.out.printf("The color is %s \n", t1.getColor());
					if (t1.isFilled())
						System.out.println("The color is filled");
					else
						System.out.println("The color is not filled");
				} catch (IllegalTriangleException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Invalid input.");
				continue;
			}

			System.out.println("Create another triangle? Y/N");
			String s = in.nextLine();
			char c = s.charAt(0);
			if (c == 'n' || c == 'N') {
				in.close();
				break;
			} else {
				continue;
			}
		}

	}

}

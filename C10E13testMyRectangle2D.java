import java.util.Locale;
import java.util.Scanner;

public class C10E13testMyRectangle2D {

	public static void main(String[] args) {

		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = true;
		while (flag1) {
			Scanner in = new Scanner(System.in);
			System.out.println("For base rectangle, " + "please enter 4 numbers as the center X, "
					+ "center Y, width and height of the triangle: ");

			in.useLocale(Locale.US);
			in.useDelimiter("(\\s|,+)");
			double x;
			double y;
			double width;
			double height;
			C10E13MyRectangle2D r1;
			try {
				x = in.nextDouble();
				y = in.nextDouble();
				width = in.nextDouble();
				height = in.nextDouble();
				in.nextLine();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Invalid input.");
				continue;
			}
			try {
				r1 = new C10E13MyRectangle2D(x, y, width, height);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid input. Width and height must be positive.");
				continue;
			}
			flag2 = true;
			while (flag2) {
				System.out.println("Please enter x and y of a point to check: ");
				double x1;
				double y1;
				try {
					x1 = in.nextDouble();
					y1 = in.nextDouble();
					in.nextLine();
					if (r1.contains(x1, y1)) {
						System.out.println("Rectangule contains this point.");
					} else {
						System.out.println("Rectangula dosen't contain this point.");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Invalid input.");
					in.nextLine();
					continue;
				}
				System.out.print("Continue checking points? Y/N");
				String s = in.nextLine();
				char c = s.charAt(0);
				if (c == 'n' || c == 'N') {
					flag2 = false;
				} else {
					continue;
				}
				flag3 = true;
				while (flag3) {
					System.out.println("Enter the second rectangle:");
					System.out.println(
							"Please enter 4 number as the center x, center y, width and height of a rectangule to check: ");
					double x2;
					double y2;
					double width2;
					double height2;
					try {
						x2 = in.nextDouble();
						y2 = in.nextDouble();
						width2 = in.nextDouble();
						height2 = in.nextDouble();
						in.nextLine();
					} catch (Exception e1) {
						System.out.println("Invalid input.");
						in.nextLine();
						continue;
					}
					try {
						C10E13MyRectangle2D r2 = new C10E13MyRectangle2D(x2, y2, width2, height2);
						if (r1.contains(r2)) {
							System.out.println("The base rectangle contains this one.");
						} else if (r1.overlaps(r2)) {
							System.out.println("The base rectangule overlaps this one.");
						} else if(r2.contains(r1)) {
							System.out.println("This one contains the base rectangle.");
						}else {
							System.out.println("This one is outside the base rectangle.");
						}
						System.out.println("Continue checking rectangle? Y/N");
						String s2 = in.nextLine();
						char c2 = s2.charAt(0);
						if (c2 == 'n' || c2 == 'N') {
							System.out.println("Input another base rectangule? Y/N");
							String s3 = in.nextLine();
							char c3 = s3.charAt(0);
							if (c3 == 'n' || c3 == 'N') {
								flag1 = false;
								flag2 = false;
								flag3 = false;
								in.close();
								break;

							} else {
								flag3 = false;
								continue;
							}

						}
					} catch (Exception e) {
						System.out.println("Invalid input. Width and height must be positive.");

					}

				}

			}

		}

	}
}

import java.util.*;

public class C2E15DistanceOfTwoPoints {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		Double x1 = input.nextDouble();
		Double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		Double x2 = input.nextDouble();
		Double y2 = input.nextDouble();
		Double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		Double distance = Math.pow(a, 0.5);
		System.out.print("The distance between the two points is " + distance);
		

	}

}

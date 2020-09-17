import java.util.*;

public class C2E19AreaOfTrangle {
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for a triangle: ");
		Double x1 = input.nextDouble();
		Double y1 = input.nextDouble();
		Double x2 = input.nextDouble();
		Double y2 = input.nextDouble();
		Double x3 = input.nextDouble();
		Double y3 = input.nextDouble();
		Double a1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		Double a2 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);
		Double a3 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
		Double side1 = Math.pow(a1, 0.5);
		Double side2 = Math.pow(a2, 0.5);
		Double side3 = Math.pow(a3, 0.5);
		Double s = (side1 + side2 + side3) / 2.0;
		Double temp = s * (s - side1) * (s - side2) * (s - side3);
		Double area = Math.pow(temp, 0.5);
		System.out.println("The area of the trangle is " + area);

	}

}

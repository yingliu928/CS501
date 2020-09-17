import java.util.Locale;
import java.util.Scanner;

public class C7E9C7E10FindSmallestElementAndIndex {

	public static void main(String[] args) {
		double[] array = new double[10];
		
		System.out.print("Enter ten numbers:");
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		
		in.useDelimiter("(\\s|,)+");
		for(int i = 0 ; i < array.length; i++){
			array[i] = in.nextDouble();
			
		}
		in.close();
		System.out.println("The minimum number is: " + min(array));
		System.out.println("The index of the minimum number is: " + indexOfSmallestElement(array));

	}
	public static double min(double[] array) {
		int len = array.length;
		double min = array[0];
		for(int i = 1; i < len; i++) {
			if(array[i] < min)
				min = array[i];
		}
		return min;
		
	}
	
	public static int indexOfSmallestElement(double[] array) {
		int len = array.length;
		int minIndex = 0;
		for(int i = 1; i < len; i++) {
			if(array[i] < array[minIndex])
				minIndex = i;
		}
		return minIndex;
	}

}

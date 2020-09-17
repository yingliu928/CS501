import java.util.*;


public class C7E9E10E20ReviseSelectionSort {

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
		System.out.println("The min number is: " + min(array));
		System.out.println("The min index is: " + indexOfSmallestElement(array));
		selectionSort(array);
		System.out.println("The sorted array is: " + Arrays.toString(array));
		
	}
	
	public static void selectionSort(double[] list) {
		for(int i = list.length-1; i >= 0; i--) {
			double currentMax = list[i];
			int currentMaxIndex = i;
			
			for(int j = i-1; j >= 0; j--) {
				if(currentMax < list[j] ){
					currentMax = list[j];
					currentMaxIndex = j;	
				}
			}
			
			if(currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
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

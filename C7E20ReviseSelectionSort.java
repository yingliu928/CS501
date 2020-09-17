import java.util.*;


public class C7E20ReviseSelectionSort {

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

}

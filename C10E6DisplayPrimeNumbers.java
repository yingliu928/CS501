import java.util.Locale;
import java.util.Scanner;

public class C10E6DisplayPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		while(flag) {
		Scanner in = new Scanner (System.in);
		in.useLocale(Locale.US);
		in.useDelimiter("(\\s|,+)");
		System.out.println("Display prime number.");
		System.out.println("please enter upper bound limit number: ");
		try {
			int input = in.nextInt();
			in.nextLine();
			StackOfIntegers stack = new StackOfIntegers(input);
			System.out.printf("Prime Numbers < %d in decreasing Order: \n", input);
			for(int i = 2; i < input; i++) {
				if(isPrime(i))
					stack.push(i);
					
			}
			
			while(!stack.empty()){
				System.out.print(stack.pop() + " ");
			}
			System.out.println();
			System.out.println("Continue? Y/N");
			String s = in.nextLine();
			char c = s.charAt(0);
			if(c == 'y' || c == 'N') {
				continue;
			}else {
				in.close();
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid input");
			continue;
		}
		
		
		}
		

	}
	
	public static boolean isPrime(int input) {
		for (int divisor = 2; divisor <= input / 2; divisor++) {
			if (input % divisor == 0) {
				return false;
			}
		}
		return true;

	}

}


public class C5E20C6E10DisplayPrimeNumbers {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50;
		final int NUMVER_OF_PRIMES_PER_LINE = 8;
		int count = 0;
		int number = 2;
		System.out.print("The first 50 prime numbers are: \n");
		
		while (count < NUMBER_OF_PRIMES ) {
			boolean isPrime = isPrime(number);
			if(isPrime) {
				count++;
			
			if(count % NUMVER_OF_PRIMES_PER_LINE == 0 )
				System.out.println(number);
			else
				System.out.print(number + " ");
			}
			number++;
			
		}
		
	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	

}

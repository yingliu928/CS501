import java.util.Locale;
import java.util.Scanner;

public class C6E23OccurrencesOfSpecifiedCharacter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		in.useDelimiter("(\\s|,)+");
		boolean flag1 = true;
		
		while(flag1) {
			System.out.print("Enter a string:");
			String input = in.nextLine();
			boolean flag2 = true;
			while(flag2) {
				System.out.print("Enter a character to check:");
				String ch = in.nextLine();
				char c;
				if(ch.isEmpty()) {
					System.out.println("Character cannot be empty.");
					break;
				}else {
					
					c = ch.charAt(0);
				}
				try {
					System.out.println("The number of occurrences of " + c + " is " + count(input,c));
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
				}
				System.out.println("continue search another character? Y/N");
				
				char f = in.nextLine().charAt(0);
				
				if(f == 'n' || f == 'N')
					flag2 = false;
			}
			System.out.println("Done with the checking? Y/N");
			char f = in.nextLine().charAt(0);
			if(f == 'y' || f == 'Y')
				flag1 = false;	
				
		}
		in.close();
		

	}

	private static int count(String str, char c) throws Exception  {
		if(str == "")
			throw new Exception("Input string cannot be empty.");

		int count = 0;
		for(char a:str.toCharArray()) {
			if(a == c) {
				count++;
			}
		}
		return count;
	}

}

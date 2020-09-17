import java.util.Scanner;

import javax.swing.JPasswordField;

public class C6E18CheckPassword {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("* A password must have at least eight characters.");
		System.out.println("* A password consists of only letters and digits.");
		System.out.println("* A password must contain at least two digits.");
		boolean flag = true;
		while(flag) {
			System.out.println("Please enter the password:");
			String input = in.nextLine();
			JPasswordField jp = new JPasswordField(input);
			char[] pwd = jp.getPassword();
			
			try {
				if(isValid(pwd)) {
					System.out.println("Valid Password.");
				}else {
					System.out.println("Invalid Password.");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			boolean flag2 = true;
		    while(flag2) {
		    		System.out.println("Continue to check? Y/N");
			
					String s = in.nextLine();
					if(s.length() == 0) {
						System.out.println("Invalid input.");
						continue;
					}else {
						char f = s.charAt(0);
						if(f == 'n' || f == 'N') {
						flag = false;
						flag2 = false;
						}else {
							break;
						}
					}
		    }
			  
		}
		in.close();
		

	}

	private static boolean isValid(char[] pwd) throws Exception{
		if(pwd == null)
			throw new Exception("Password shouldn't be empty.");
		
		if(countChar(pwd) >= 8 && legal(pwd) && countDigits(pwd) >= 2 )
			return true;
		else
			return false;
	}
	// A password must have at least eight characters
	private static int countChar(char[] pwd) {
		
		return pwd.length;
	}
	//consists of only letters and digits
	private static boolean legal(char[] pwd) {
		for(char c:pwd) {
			if(!((c >='a' && c <= 'z')
					|| (c >= 'A' && c <= 'Z') 
					|| (c >= '0' && c <= '9')))
					return false;
			
		}
		return true;
	}
	//contain at least two digits
	private static int countDigits(char[] pwd) {
		int count = 0;
		for(char c : pwd) {
			if(c >= '0' && c <= '9') {
				count++;
			}
		}
		return count;
	}

}

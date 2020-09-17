import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.filechooser.FileNameExtensionFilter;

public class C12E13CountInFile {

	public static void main(String[] args) throws FileNotFoundException {
		//File file = new File("C:\\Users\\Eva\\eclipse-workspace\\CS501\\src\\a.txt");
		//File file = new File(args[0]);
		//--------JFileChooser with open dialog version----
		boolean flag = true;
		while(flag) {
			JFileChooser fileChooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
		             "txt", "TXT");
			fileChooser.setFileFilter(filter);
			fileChooser.setDialogTitle("Select a .txt file to count");
		     int returnVal = fileChooser.showOpenDialog(null);
		     
		     if(returnVal == JFileChooser.APPROVE_OPTION) {	     
		       	 File file = fileChooser.getSelectedFile();
				//-------------------------------------------------------
			         try {
						countFile(file);
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
			        }
			         
			        boolean flag2 = true;
				    while(flag2) {
				    		System.out.println("Continue to count? Y/N");
				    		Scanner in = new Scanner(System.in);
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
							in.close();
				    }
		    
		     }
		     
	     }
	}

	private static void countFile(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		sc.useLocale(Locale.US);
		
		int cl = 0;
		int cs = 0;
		int cc = 0;
		int cw = 0;
		while(sc.hasNextLine()) {
			cl++;
			String line = sc.nextLine();
			String[] word = line.trim().split(" ");
			cw += word.length;
			for(String s: word) {
				cc += s.length();
			}

		}
		sc.close();
		System.out.println("File " + file.getName() + " has");
		System.out.println(cl + " Lines");
		System.out.println(cw + " words");
		System.out.println(cc + " characters");

	}


}

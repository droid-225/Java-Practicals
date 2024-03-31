import java.util.Scanner;

public class Prac8 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str;
		boolean newWord = true;
		int n = 0;
		
		System.out.print("Enter a String: ");
		str = in.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				newWord = false;
			else
				newWord = true;
			
			if((str.charAt(i) >= 65 && str.charAt(i) <= 90) && newWord) {
				n++;
			}
		}
		
		System.out.println("Number of Words With a Capital Letter = " + n);
	}
}

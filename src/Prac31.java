import java.util.*;

public class Prac31 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String binaryString;
		
		System.out.print("Enter a Binary String: ");
		binaryString = in.next();
	
		bin2Dec(binaryString);
	}
	
	static void bin2Dec(String binaryString) {
		int dec = 0;
		char[] charBits = binaryString.toCharArray();
		int[] bits = new int[charBits.length];
		int pow = bits.length - 1;
		
		try {
			for(int i = 0; i < charBits.length; i++) {
				bits[i] = Integer.parseInt(String.valueOf(charBits[i]));
				if(charBits[i] != '0' && charBits[i] != '1')
					throw new NumberFormatException("Number Entered is Not a Binary Number!");
			}
			for(int i = 0; i < bits.length; i++) {
				dec += bits[i] * Math.pow(2, pow);
				pow--;
			}
			
			System.out.println(binaryString + " = " + dec);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}

class NumberFormatException extends Exception {
	NumberFormatException(String message) {
		super(message);
	}
}
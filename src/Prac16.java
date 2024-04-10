// Enter 10 numbers, display reversed numbers

import java.util.Scanner;

public class Prac16 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String[] nums = new String[10];
	
		System.out.println("Enter 10 Numbers:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter Number " + (i + 1) + ": ");
			nums[i] = reverse(in.next());
		}
		
		System.out.println("Your Numbers Reversed: ");
		for(int i = (nums.length - 1); i > 0; i--) {
			System.out.print(nums[i] + " ");
		}
	}
	
	static String reverse(String s) {
		String rev = "";
		
		for(int i = (s.length() - 1); i >= 0; i--)
			rev += s.charAt(i);
		
		return rev;
	}
}

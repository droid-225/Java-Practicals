// Enter and sort integer array

import java.util.*;

public class Prac18 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[] ints;
		int size;
		
		System.out.print("How Many Elements? ");
		size = in.nextInt();
		ints = new int[size];
		
		System.out.println("Enter Your Elements: ");
		for(int i = 0; i < size; i++) {
			System.out.print("Enter Element " + (i + 1) + ": ");
			ints[i] = in.nextInt();
		}
		
		Arrays.sort(ints);
		
		System.out.println("Sorted Array: ");
		for(int i: ints) {
			System.out.print(i + " ");
		}
	}
}

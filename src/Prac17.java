// 6 x 6 matrix, filled with 0s and 1s, find rows and columns with odd # of 1s

import java.util.Random;

public class Prac17 {
	public static void main(String args[]) {
		Random ran = new Random();
		int[][] matrix = new int[6][6];
		boolean[] rows = new boolean[6], columns = new boolean[6];
		int count = 0;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				matrix[i][j] = ran.nextInt(2);
			}
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 6; i++) {
			count = 0;
			for(int j = 0; j < 6; j++) {
				if (matrix[i][j] == 1)
					count++;
			}
			if (count % 2 != 0)
				rows[i] = true; 
		}
		
		int j;
		for(int i = 0; i < 6; i++) {
			count = 0;
			j = 0;
			while (j != 6) {
				if (matrix[j][i] == 1)
					count++;
				j++;
			}
			if (count % 2 != 0)
				columns[i] = true; 
		}
		
		System.out.print("\nRows With Odd Number of 1s: ");
		for(int i = 0; i < 6; i++) {
			if(rows[i])
				System.out.print((i + 1) + " ");
		}
		
		System.out.print("\nColumns With Odd Number of 1s: ");
		for(int i = 0; i < 6; i++) {
			if(columns[i])
				System.out.print((i + 1) + " ");
		}
	}
}

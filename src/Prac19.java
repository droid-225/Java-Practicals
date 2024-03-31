// addition of two matrices

import java.util.*;

public class Prac19 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[][] mat1, mat2, sum;
		int rows, columns;
		
		System.out.print("Enter Number of Rows of Both Arrays: ");
		rows = in.nextInt();
		
		System.out.print("Enter Number of Columns of Both Arrays: ");
		columns = in.nextInt();
		
		mat1 = new int[rows][columns];
		mat2 = new int[rows][columns];
		sum = new int[rows][columns];
		
		System.out.println("\nEnter Values for Matrix 1:");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("Element [" + i + "][" + j + "]: ");
				mat1[i][j] = in.nextInt();
			}
		}
		
		System.out.println("\nEnter Values for Matrix 2:");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("Element [" + i + "][" + j + "]: ");
				mat2[i][j] = in.nextInt();
			}
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		System.out.println("\nSum Matrix of Matrix 1 and Matrix 2:");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}

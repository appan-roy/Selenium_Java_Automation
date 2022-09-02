package arrayDemo;

import java.util.Scanner;

public class MatrixTransposeFromUserInput {

	public static void main(String[] args) {

		int row, column;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the no. of rows & columns of the matrix : ");
		row = s.nextInt();
		column = s.nextInt();

		int matrix[][] = new int[row][column];
		int transpose[][] = new int[row][column];

		// Creating the matrix
		System.out.println("Enter the elements of the matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)
				matrix[i][j] = s.nextInt();
			System.out.println();
		}

		// Printing the created matrix
		System.out.println("The given matrix is : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)
				System.out.printf("%d\t", matrix[i][j]);
			System.out.println();
		}

		// Transposing the matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)
				transpose[i][j] = matrix[j][i];
			System.out.println();
		}

		// Printing the transposed matrix
		System.out.println("The transposed matrix is : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)
				System.out.printf("%d\t", transpose[i][j]);
			System.out.println();
		}

		s.close();

	}

}

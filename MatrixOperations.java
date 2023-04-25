package Jpptaskperform;

public class MatrixOperations {

	public static void main(String args[]) {
	
		// creating two matrices
		int a[][] = { { 1, 3 }, { 2, 4 } };
		int b[][] = { { 1, 3 }, { 2, 4 } };

		// creating another matrix to store the sum of two matrices

		int c[][] = new int[2][2]; // 3 rows and 3 columns

		System.out.println("*******************ADDITION*******************");
		// adding and printing addition of 2 matrices
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j]; 
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}

		System.out.println("*******************SUBSTRACTION*******************");

		// substracting and printing addition of 2 matrices
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] - b[i][j]; // use - for subtraction
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}

		System.out.println("*******************MULTIPLICATION*******************");

		// multiplication and printing addition of 2 matrices

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] * b[i][j]; // use * for multiplication
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}
		
		System.out.println("*******************DIVISION*******************");

		// division and printing addition of 2 matrices

		for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						c[i][j] = a[i][j] / b[i][j]; // use / for division
						System.out.print(c[i][j] + " ");
					}
					System.out.println();// new line
				}
	}
}

package chapter_1;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printArray(matrix);
		System.out.println();
		printArray(rotateMatrix(matrix));

	}

	private static int[][] rotateMatrix(int[][] matrix) {
		int arrLength = matrix.length;
		for (int i = 0; i < arrLength; i++) {
			for (int j = i; j < arrLength; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < arrLength; i++) {
			for (int j = i; j < (arrLength/2); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][arrLength-1-j];
				matrix[i][arrLength-1-j] = temp;
			}
		}
		return matrix;
	}

	private static void printArray(int[][] arr) {
		for (int[] a : arr) {
			for (int i : a) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
		}

	}

}

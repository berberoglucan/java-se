package _22.arrays;

public class ArrayTest {

	public static void main(String[] args) {

		// array'ler reference type degiskenlerdir

		int[] goodArray; // uninitialize;

		int badArray[];

		int[][] goodMatrix;

		int[] badMatrix[];

		int[] testScores = new int[4];

		for (int i : testScores) {
			System.out.println(i);
		}

		int[][] myArray = new int[3][]; // array'in elemanlari int[] tipinde olacaktir.

		int[] array = { 1, 2, 3, 4 };

		int[] arrayNew = new int[] { 1, 2, 3, 4 };

	}

}

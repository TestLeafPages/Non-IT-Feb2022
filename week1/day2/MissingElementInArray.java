package week1.day2;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class MissingElementInArray {
	

	public static void main(String[] args) {
		
		
		int[] arr1 = { 1, 2, 3, 4, 7, 6, 8 };// 0
		// 0 1 2 3 4 5 6
		// Sort the array
		Arrays.sort(arr1);// arrange the array
		int length2 = arr1.length;

		System.out.println(length2);

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = arr1[0]; i < length2; i++) {

			// check if the iterator variable is not equal to the array values respectively
			if (arr1[i - 1] != i) {
				// print the number
				System.out.println(i);
				// once printed break the iteration
				break;
			}

			

		}

	}
}

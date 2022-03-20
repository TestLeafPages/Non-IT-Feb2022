package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {

	public static void main(String[] args) {

		/*
		 * Index starts with 0
		 * length -> to find the number of data in an array
		 * array[index] -> to get single data from an array
		 * Index of last data -> length-1
		 * Arrays.sort(arrayName) -> to sort the data in an array
		 * Size of array -> Declared at the creation of array
		 * Size of array -> fixed; we can not able to change the size at runtime
		 */
				//int[] -> int  array 
				//String[] -> String array
				//data saved with index
				int[] nums = {1,2,3,4,5,6,7}; //0,1,2,3,4,5,6
				
				
				//System.out.println(nums.length); //total number = 7
				
			//	int lastIndex = nums.length -1; // lastIndex = 6
				
			//	System.out.println(nums[lastIndex]);
				
				//to sort the data in an array
				Arrays.sort(nums); //1,2,3,4,5,6,7
				for (int i = 0; i < nums.length; i++) {
					System.out.println(i);
				}
	}
				

	}

}

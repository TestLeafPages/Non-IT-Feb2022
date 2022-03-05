package week3.day1;

import java.util.Arrays;

public class LearnArrays {

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
		//System.out.println(nums.length); //total number = 6
		
		//	int lastIndex = nums.length -1; // lastIndex = 5
			
		//	System.out.println(nums[lastIndex]);
		
		
		
		int[] num = { 10, 20, 20, 50, 70, 60, 60, 30 };// 0
		int length = num.length;
      System.out.println(length);
		Arrays.sort(num);// 10,20,20,30,50,60,60,70
		System.out.println(num);
		for (int i = 0; i < num.length; i++) {
			if (num[i] == num[i + 1])
				//0==0-1
				System.out.println(num[i]);
		}
	}

}

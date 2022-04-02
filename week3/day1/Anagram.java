package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		//Declare a String 
		String text1 = "thing";
		////Declare another String
		String text2 = "night"; 
		
		//a) Check length of the strings are same then (Use A Condition)
	
	int length1 = text1.length();
	System.out.println(length1);
	int length2 = text2.length();
	System.out.println(length2 );
	if(length1==length2) {
		System.out.println("Length is equal");
	}
	else
	{
		System.out.println("length is not equal");
	}
	//* b) Convert both Strings in to characters
	char[] arr1 = text1.toCharArray();
	char[] arr2 = text2.toCharArray();
	Arrays.sort(arr1);//
	Arrays.sort(arr2);
	//d) Check both the arrays has same value
	if (Arrays.equals(arr1, arr2)) {
		System.out.println("ANAGRAM");
		
	}
	else {
		System.out.println("NOT ANAGRAM");
	}
	
	
	
	
	
	
	
	
	}

}

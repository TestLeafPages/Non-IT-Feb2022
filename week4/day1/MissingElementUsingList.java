package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {
		 
		// Here is the input
		        Integer[] arr = {1,2,3,4,7,6,8};
		        //using List
		        List<Integer>number=new ArrayList<Integer>();
		        //add the value in list
		        number.addAll(Arrays.asList(arr));
		        // Sort the array    
		        Collections.sort(number);
		        // loop through the array (start i from arr[0] till the length of the array)
		          for (int i =0; i <=number.size()-1; i++) {
		        	 
		        // check if the iterator variable is not equal to the array values respectively
		            if(number.get(i)!=i+1) {
		                // print the number
		            	System.out.println("Missing number is: "+(i+i));
		       	         
		                // once printed break the iteration
                     break;
                       }
	                   }

                 }
               }
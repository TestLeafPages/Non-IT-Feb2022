package week3.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
        int range = 8, firstNum = 0, secNum = 1, sum;
	// Print first number and second num
	System.out.println(firstNum);
	System.out.println(secNum);
	// Iterate from 1 to the range
	for (int i=1;i<=range;i++) {
	// add first and second number assign to sum
    sum=firstNum+secNum;//0+1=1
	// Assign second number to the first number
    firstNum=secNum;//1
	// Assign sum to the second number
    secNum=sum;
	// print sum
System.out.println(sum);
	}
	}
}

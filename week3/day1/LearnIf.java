package week3.day1;

public class LearnIf {

	public static void main(String[] args) {
		/*Pseudocode:
		----------
		 1. Initialize a number, say, int number= 35;
		 2. If a number is positive, print "The number is positive"
		    If a number is negative, print "The number is negative"
		    If it nether negative nor positive, print as "The number is neither positive nor negative"*/

		int number=0;
		if(number>0) {
			System.out.println("The number is positive");
		}
		else if(number<0) {
			System.out.println("The number is negative");
		}
		else {
            System.out.println("The number is neither positive nor negative");
	}

}
}

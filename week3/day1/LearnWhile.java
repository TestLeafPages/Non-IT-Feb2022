package week3.day1;

public class LearnWhile {

	public static void main(String[] args) {
		/*
		 * int i=1; while(i<=10) { System.out.println(i); i++; }
		 */
		//Sum of The Digit 234=9
		int num=234;
		int rem,sum = 0;
		while(num>0) {
			rem=num%10;//4 3 2
			num=num/10;//23 2
			sum=sum+rem;
		}
		System.out.println(sum);
		
		
	}
	}


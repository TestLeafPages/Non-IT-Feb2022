package week1.day2;

public class LearnControlStatement {

	public static void main(String[] args) {
		
		if (2<3) {
			System.out.println("Greater");
			
		}
		short age=17;
		if (age>=18) {
			System.out.println("Eligible for vote");
			
		}
		int a=3;
		int b=3;
		if (a!=b) {
			System.out.println("Not equal");
			
		}
		else {
			System.out.println("Is equal");
		}
		int mark1=15;
		if (mark1>=35) {
			System.out.println("pass");	
		}
		else
		{
		System.out.println("fail");
		}
		int num1=5;
		int num2=6;
		if(num1==num2) {
			System.out.println("Equal");	
		}
		else {
			System.out.println("Not equal");
		}
		
		int age1 =17;
		 if (age1<18) {
			 System.out.println("minor");
	
		}
		 else if(age1>18) {
			 System.out.println("major");	 
		 }
		 else {
			 System.out.println("the age below");
		 }
		
//classroom
		 int num=13;
		 if(num%3==0 && num%5==0) {
			 System.out.println("TANPAN");
		 }
		 else if(num%3==0) {
			 System.out.println("TAN");
		 }
		 else if(num%5==0) {
			 System.out.println("PAN");
		 }
		 else {
			 System.out.println("My output");
		 }

	}

}

package week3.day1;

import java.util.Iterator;

public class BreakStatement {

	public static void main(String[] args) {
		//break-----stop the execution and go out of the loop
      for (int i = 1; i <=5; i++) {
    	  
		if(i==3) {
			System.out.println("stop");
			break;
		}
		System.out.println(i);
	}
      
      
	}

}

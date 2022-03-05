package week3.day1;

public class TANPAN {

	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			
		
		if(i%3==0 && i%5==0) {//AND 0*1=0,1*0=0,1*1=1
			System.out.println(i+"TANPAN");
		}
		else if(i%3==0) {
			System.out.println(i+"TAN");
		}
		else if(i%5==0){
			System.out.println(i+"PAN");
		}
		
		else {
			System.out.println(i+"NO output");
		}
	}

}
}
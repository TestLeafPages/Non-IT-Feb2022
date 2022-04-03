package week3.day2;

public class Calculator {
public void add(int a,int b) {
	System.out.println(a+b);
	
}
public void add(int b,int c, int d) {
	System.out.println(b+c+d);
	
}
public void sub(int b,int c) {
	System.out.println(b-c);
	
}
public void sub(double a,double b,int c ) {
	System.out.println(a-b-c);
	
}
public void mul(int a,int b) {
	System.out.println(a*b);
	
}
public void mul(double a,int b) {
	System.out.println(a*b);
	
}
public void div(double a,double b) {
	System.out.println(a/b);
	
}
public void div(double a,float b) {
	System.out.println(a/b);

	
}
public static void main(String[] args) {
	Calculator cal=new Calculator();
	cal.add(5, 5);
	cal.add(5, 5, 5);
	cal.sub(7, 8);
	cal.sub(10.6, 3.6, 9);
	cal.mul(10.7, 8);
	cal.mul(5, 7);
	cal.div(2.3, 5.6);
	cal.div(3.4, 0.6);
	
}


}

package week4.day1;

public class WrapperClass {
	 

	public static void main(String[] args) {
		Object[] array= {1,2,3,4,5,2001,2002,2004,"Princila","yamini","balaji",'m','f',10.5,16.5};
		int empId=12333;
		char gender='m';
		Integer empAge=12;
		Character name='a';
		Double num=12.3d;
		
		System.out.println(empId);
		double valu=empAge.doubleValue();
		System.out.println(valu);
		System.out.println(empAge.doubleValue());
		
		System.out.println(name.toString());
		System.out.println(num.toString());
		
		

	}

}

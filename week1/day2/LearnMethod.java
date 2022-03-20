package week1.day2;

public class LearnMethod {
	static short wheel;
	int otp;
	long regNum;
	long regnum;
	float num;
	double accountBalance=34.233d;
	char status='P';
	String name="swift";
	boolean isEmpty;
	
	
    //method 
	public int driveCar(String swift) {
		wheel=6;
		System.out.println("My Cardfjhgh244769880-!@#$%");
		System.out.println(num);
         return wheel;
	}
	private long gearCar() {
		System.out.println("GearCar");
		System.out.println(otp);
		System.out.println(isEmpty);
		return regNum;
	}
	public int addTwoNumber(int a,int b){ 
		int sum=a+b;
		System.out.println(sum);
		return sum;
		
		}
	

	public static void main(String[] args) {
		
		long regNum=12345678987665L;
		
         //create object
		//Classname objectname=new Classname();
		LearnMethod car = new LearnMethod();
		//by using objectname i can call the method
		car.driveCar();
		car.gearCar();
		System.out.println(wheel);
	
		
	
	}

}

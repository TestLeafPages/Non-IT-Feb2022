package week1.day1;

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
	public void driveCar() {
		wheel=6;
		System.out.println("My Cardfjhgh244769880-!@#$%");
		System.out.println(num);

	}
	private void gearCar() {
		System.out.println("GearCar");
		System.out.println(otp);
		System.out.println(isEmpty);
		
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

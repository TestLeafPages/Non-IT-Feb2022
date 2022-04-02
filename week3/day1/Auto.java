package week3.day1;

public class Auto extends Vehicle{
	public void kickStart() {
		System.out.println("Auto kickStart");
		
	}

	public static void main(String[] args) {
		Auto obj=new Auto();
	     obj.applyBreak();
	     obj.soundHorn();
	     obj.kickStart();

	}

}
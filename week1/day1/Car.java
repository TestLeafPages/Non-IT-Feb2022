package week1.day1;
//Access modifier keyword-class  ClassName
public class Car {
	
	
	       public void driveCar() {
	    	   System.out.println("driveCar");
	       }
	       private void applyBreak() {
	    	   System.out.println("applyBreak");
			
		}
	    //	access modifier keyword	return type methodname(arg)
	    	public static void main(String[] args) {
				//creating object
	    		//classname objectname=new classname();
	    		Car obj = new Car();
	    		//to call the method by using creating the object
	    		obj.applyBreak();
	    		obj.driveCar();
	    		obj.toString();
	    		System.out.println("welcome");
	        	
	    	}
}

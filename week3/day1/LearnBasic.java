package week3.day1;

public class LearnBasic {
	
public void dataType() {
	System.out.println("DataType");
}
private void condition() {
	System.out.println("Condition");
	
}
protected void samePack() {
	System.out.println("SamePackage");
}
void defaultMehod() {
	System.out.println("Default Method");
}
	public static void main(String[] args) {//main method
		//Create object for particular class
		LearnBasic obj=new LearnBasic();
		obj.condition();
		obj.dataType();
		obj.defaultMehod();
		obj.samePack();
		System.out.println("Welcome");

	}

}

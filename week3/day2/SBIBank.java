package week3.day2;

public interface SBIBank extends RBI{
	//design-Template
	public  String name="bank";
	
	public void applyTax();
		
	 void ApplyGst(); 
	//same package we can use-default
	void applyInterest();
	
}

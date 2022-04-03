package week3.day2;

public  class SRClass extends AxisMAU implements RBI,SBIBank{
//100%implemented method only
	static int a;
	static int b;
	//label username input textbox
	//label passwrd input textbox
	//login label name login button 
	public static void main(String[] args) {
		SRClass bank=new SRClass();
		System.out.println(SBIBank.name);
		bank.ApplyGst();
		bank.applyInterest();
		AxisMAU.maxBalance();
		

	}

	
	public void applyTax() {
		
		
	}

	
	public void ApplyGst() {
		// TODO Auto-generated method stub
		
	}


	public void applyInterest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int amount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double maxWindraw() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void minInterest() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void newidea() {
		// TODO Auto-generated method stub
		
	}
	
}

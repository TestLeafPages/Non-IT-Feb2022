package week3.day2;

public class AxisBank extends Bank {
	
	public void savingAccount(int interset,String name) {
		System.out.println("5% interest");
		
	}
	public void fixedDeposit() {
		System.out.println("7% interest");
		
	}
    public void gst() {
	System.out.println("5% gst");
	
}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.savingAccount(0, null);
		ab.fixedDeposit();
		ab.gst();

	}

}

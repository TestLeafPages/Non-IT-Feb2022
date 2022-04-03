package week3.day2;

public class Bank {
	public void savingAccount(int interset,String name) {
		System.out.println("7% interest");
		
	}
	public void fixedDeposit() {
		System.out.println("7% interest");
	}

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.savingAccount(0, null);
		obj.fixedDeposit();

	}

}

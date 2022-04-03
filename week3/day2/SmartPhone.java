package week3.day2;

public class SmartPhone extends AndroidPhone {
public void connectWhatsApp() {
	System.out.println("connectWhatsApp");
	
}
public void  takeVideo() {
	System.out.println(" takeVideo");
	
}
	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone();
phone.saveContact();
phone.sendMsg();
phone.makeCall();
phone.connectWhatsApp();
phone.takeVideo();
	}
}



package week3.day2;

public class AndroidPhone extends Mobile {
	//variable final no one can change the value
	public  final String name="phone";
	
	public  static void  takeVideo() {
		System.out.println(" takeVideo");
		
		
	}
	public   void sendMsg() {
		System.out.println("sendMsg");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(name);
		
		takeVideo();
		Mobile.sendMsg();
		
	}
	
}

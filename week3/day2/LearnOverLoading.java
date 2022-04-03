package week3.day2;

public class LearnOverLoading {

	public void add(int a,int b) {
	System.out.println(a+b);
	
}

public void add(int c, double d) {
	System.out.println(c+d);
	
}
public void studentDetail(String name, int Id,int regnum) {
	System.out.println(name+Id+regnum);
}
public void studentDetail(String school, short age,int num) {
	System.out.println(school);
	System.out.println(age);
}
	public static void main(String[] args) {

//the same method with different argument
		LearnOverLoading overLoad=new LearnOverLoading();
		
		overLoad.add(2, 5);
		overLoad.add(5, 5);
		overLoad.studentDetail("priny", 1234, 0);
		overLoad.studentDetail("school",12, 0);
	}

}

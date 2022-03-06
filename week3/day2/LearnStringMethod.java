package week3.day2;

public class LearnStringMethod {

	public static void main(String[] args) {
	//String Literal
		//datatype variablename=" value";
		String str="Welcome";
		String str2="welCome";
		//create the obj for String
		String str1=new String("welcoMe");
		char[]ch=new char[5];
		//ASCII  A-65,B-66,a=97,b=98   appLE
		ch[0]='W';
		
		//Validate if both string have same memory
		
		System.out.println(str==str2);//compare the memory location
		
		//Compare the value of String
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//Find the length of String
		int strlength = str.length();
		System.out.println(strlength);
		
		//convert String to CharacterArray
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		//get specific character
		char charAt = str.charAt(5);
		System.out.println(charAt);
		
		//get the index of specific character
		int indexOf = str.indexOf('e');
		System.out.println(indexOf);
		
		String s="     Welcome  To Testleaf   ";
		//How to get part of String
		System.out.println(s.substring(7));
		System.out.println(s.substring(3,7));
		
		//trim the String ---remove the space
		System.out.println(s.trim());
		
		//Convert String to uppercase/lowercase
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String name="We learn java lastWeek";
		//Split Words in String
		String[] split = name.split(" ");
		System.out.println(name);
		
		//How to replace something in String
		System.out.println(s.replace('e', '@'));
		System.out.println(s.replaceAll(str1, s));
		//join two string
		System.out.println(str1.concat(name));
			
		
	}

}

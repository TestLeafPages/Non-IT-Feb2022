package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		//String Literal
		
		
		//String Object
		  String str2="Welcome";
		  String str=new String("Welcome");
		  if(str==(str2)) {//== it compare thememory location 
			  System.out.println("The String is Same"); 
			  }
		  else {
		  System.out.println("The String is Different"); }
		 
		String str3="Welcome";
		String str1="TestLeafLocatedInChennaiIntheYear2009";//index---start 0.....n
		//To get individual char from the string
		//To get specific char
		char charAt = str2.charAt(3);//ctrl+2+l
		char charAt2 = str1.charAt(4);
		System.out.println(charAt);
		System.out.println(charAt2);
	
		//Compare the value
	
		boolean equals = str1.equals(str2);
		System.out.println(equals);
		
		//To print direct
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//Find to length of the string
		int length = str1.length();
		System.out.println(length);
		
		//Array----Store multiple value[10]
		//Convert string to character array
	char[] charArray = str1.toCharArray();
	System.out.println(charArray);
	 for (int i =0 ; i < charArray.length; i++) {
		 
	 }
	     int[] num=new int [4];
		 char[]ch =new char[4];
		 ch[0]='W';
		 ch[1]='E';
		 
		
		 // get the index of specific character
		  int indexOf = str1.indexOf('c');
		
		 System.out.println(indexOf);
		
		 
		 
		 //How to get part of string//welcome
		
		 //to give  the Start index
		 String substring = str1.substring(indexOf);
		 System.out.println(substring);
		
		 //start and stop index+1
		 System.out.println(str1.substring(3,6));
		String name="TESTLEAF";
		
		//to remove the space
		 System.out.println(name);
		 String trim = name.trim();
		 System.out.println(trim);
		
		 //Split the String
		 String[] split = name.split("");
		 System.out.println(split[1]);
		 /*for (int i = 0; i < split.length; i++) {
			 
			System.out.println(split[i]);
		}*/
		 
		 
		 
		 //convert the TO UPPERE CASE
		 System.out.println(str1.toUpperCase());
		 
		 //convert the String to lowercase
		 System.out.println(str1.toLowerCase());
		 
		 //How to replace String
		 String name1="       TestLeafLocatedInChennaiIntheYear2009"      ;
		 
		 String replace = name1.replace("e", "@");
		 System.out.println(replace);
		 
		 String replaceAll = name1.replaceAll("\\D", " ");//regex
		 System.out.println(replaceAll);
		
		 //To add the two string
		 
		String s1="TEST";
		String s2="LEAF";
		String concat = s1.concat(s2);
		System.out.println(concat);
		System.out.println(s1+s2);
		System.out.println(124241+s1);
		
		
		
		
		
		
		
		
		
	 }		
		
		

	}

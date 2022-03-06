package week3.day2;

public class LearnString {

	

	public static void main(String[] args) {
		//Input="TestLeaf"
		//to find length of string
		//convert the string to charArray[]T e s t  L e a f
		//loop every char
		//if()
		//value is match count++
		//print
		
		String input="Testleaf";
		//convert string to charArray
		char[]charArray = input.toCharArray();
		int strlength = input.length();//find the length of the String
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='e' ) {
				
				int count = 0;
				count++;
				
			
			System.out.println("No of duplicates:"+count);
		}
	}
	}
}

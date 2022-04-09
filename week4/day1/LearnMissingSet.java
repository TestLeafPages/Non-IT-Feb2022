package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnMissingSet {

	public static void main(String[] args) {
		//int[]num={4,6,7,3,2,1,8,2,4,3,7,8,7}
		int[] num= {4,6,7,3,2,1,8,2,4,3,7,8,7};
		//use set to remove the duplicate
		Set<Integer>removeDup=new TreeSet<Integer>();
		//System.out.println(removeDup);
		//iterate with for loop
		for (int i = 0; i < num.length; i++) {
			removeDup.add(num[i]);		
		}
		System.out.println(removeDup);
	
	//Convert set to list 
	List<Integer> allnum=new ArrayList<Integer>(removeDup);
	for (int i = 0; i <=allnum.size(); i++) {
		if(i!=allnum.get(i)-1) {//6  6-1=5
			System.out.println(i+1);
			break;
		}
	}
	
	}
}









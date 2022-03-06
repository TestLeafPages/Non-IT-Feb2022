package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(6);
		set.add(2);
		set.add(5);
		set.add(3);
		set.add(2);
		set.add(4);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.remove(2));
		System.out.println(set);
		System.out.println(set.contains(3));
		for (Integer output :set) {
			System.out.println(output);
			
		}	
		set.clear();
		List<Integer>lst=new ArrayList<Integer>(set);
		for (int i = 0; i <lst.size() ; i++) {
			lst.add(i);
			System.out.println(i);
			
		
			
		}

	}

}

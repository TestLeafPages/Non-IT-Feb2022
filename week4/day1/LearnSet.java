package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> company=new LinkedHashSet<String>();
		
		company.add("Infosys");
		company.add("CTS");
		company.add("TCS");
		company.add("Infosys");
		company.add("cts");
		company.add("accenture");
		company.add("TCS");
		company.add("");
		company.add("");
		
		//print the set
		System.out.println(company);
		boolean add = company.add("Amazon");
		System.out.println(company.contains("Amazon"));
		System.out.println(company.remove("TCS "));
		System.out.println(company);
		company.clear();
		System.out.println(company);
		System.out.println(company.isEmpty());
	}

}

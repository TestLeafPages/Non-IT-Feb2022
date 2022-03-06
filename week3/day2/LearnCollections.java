package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnCollections {

	public static void main(String[] args) {
		List<String>lst=new LinkedList<String>();
		lst.add("Giritharan");
		lst.add("Murali");
		lst.add("Aravindhan");
		lst.add("Sheelaw");
		lst.add("lokesh kumar");
		lst.add("lokesh kumar");
		lst.add("lokesh kumar");
		
		System.out.println(lst.add("Keerthana"));
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst.size());
		System.out.println(lst.contains("lokesh kumar"));
		lst.remove(3);
		System.out.println(lst);
		System.out.println(lst.get(3));
		lst.clear();
		System.out.println(lst);
		System.out.println(lst.contains("lokesh kumar"));
		System.out.println(lst.isEmpty());
		
	}

}

package arraylistassignments;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("banana");
		al.add("Mango");
		al.add("cucumber");
		
		System.out.println("Original List: " +al);
		List<String> sublist = al.subList(0,3);
		System.out.println("List of first three elements :" +sublist);
		

	}

}

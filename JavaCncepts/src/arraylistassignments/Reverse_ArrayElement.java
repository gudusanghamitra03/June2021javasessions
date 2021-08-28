package arraylistassignments;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_ArrayElement {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("banana");
		al.add("Mango");
		al.add("cucumber");
		
		System.out.println(al.toString());
		
		Collections.reverse(al);
		System.out.println(al);
		

	}

}

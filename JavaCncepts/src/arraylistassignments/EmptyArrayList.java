package arraylistassignments;

import java.util.ArrayList;

public class EmptyArrayList {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		
		System.out.println(al);
		//Empty ArrayList
		al.clear();
		System.out.println(al);

	}

}

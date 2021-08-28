package arraylistassignments;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("banana");
		al.add("Mango");
		al.add("cucumber");
		
		//Display ArrayList before swap
		System.out.println("Before swap the ArrayList");
		System.out.println(al);
		
		//Swapping Two Elements
		Collections.swap(al,1, 2);

		//Display ArrayList After swap
		System.out.println("After swap the ArrayList");
		System.out.println(al);
		

	}

}

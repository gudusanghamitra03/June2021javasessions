package arraylistassignments;

import java.util.ArrayList;

public class SearchElementInArrayList {

	public static void main(String[] args) {
		ArrayList<String> pl = new ArrayList<String>();
		pl.add("C");
		pl.add("C++");
		pl.add("JAVA");
		pl.add("python");
		pl.add("perl");
		pl.add("Ruby");
		pl.add("Linux");
		
		//search an element using 3 ways
		//Using Contains method,check the given element in arraylist
		
		System.out.println("JAVA programming language is present in arraylist  : " + pl.contains("JAVA"));
		
		//using indexOf() method
		
		System.out.println("Index of C++ : " + pl.indexOf("C++"));
		System.out.println("Index of C : " + pl.indexOf("C"));
		System.out.println("Index of perl : " + pl.indexOf("perl"));
		
		//Using lastIndexOf() method
		System.out.println("Index of Linux : " + pl.lastIndexOf("Linux"));
		
		

	}

}

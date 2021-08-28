package arrayassignments;

import java.util.ArrayList;

public class ArrayList_Assignment1 {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Black");
		colors.add("White");
		colors.add("Red");
		colors.add("Yellow");
		
		/*System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		System.out.println(colors.get(2));
		System.out.println(colors.get(3));
		System.out.println(colors.get(4));*/

		for(String e : colors)
		{
			System.out.println(e);
			
		}
	System.out.println(colors.size());	
	
	
		
	}

}

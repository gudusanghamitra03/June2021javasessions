package arraylistassignments;

import java.util.ArrayList;

public class AddArray_To_Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		//System.out.println(ar);
//Insert elements		
		
		ar.add(10);
		ar.add(20);
		ar.add(40);
		ar.add(50);
		ar.add(90);
		
//Retrieve elements	:
		
		
		System.out.println("Insert the element at 1st position  :"+ar.get(0));
		
		System.out.println("Insert the element at last position  :"+ar.get(4));
		
//update elements:
		ar.set(2,30);
		
//Remove elements:		
		ar.remove(4);
		
		for(Integer e: ar){
			System.out.println(e);
		}

	}

}

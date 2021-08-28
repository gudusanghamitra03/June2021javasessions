package arraylistassignments;

import java.util.ArrayList;

public class TrimVcArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(50);
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(1);
		ar.add(1);
		ar.add(6);
		ar.add(7);
		ar.add(8);
		ar.trimToSize();
		
		System.out.println(ar);
		

	}

}

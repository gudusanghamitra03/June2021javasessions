package arrayassignments;

public class StaticArray {

	public static void main(String[] args) {
		Object obj[]= new Object[7];
		obj[0]= "Sachin";
		obj[1]=39;
		obj[2]="Mumbai Team";
		obj[3]="08-07-1980";
		obj[4]='M';
		obj[5]= 34.45;
		obj[6]= true;
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(i +" :"+obj[i]);
		}
    
	}

}

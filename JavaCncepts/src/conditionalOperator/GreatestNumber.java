package conditionalOperator;

public class GreatestNumber {

	public static void main(String[] args) {
		int a=25,b=78,c=87;
		System.out.println("TestData ");
		System.out.println("input the 1st Number : " +a);
		System.out.println("input the 2nd Number : " +b);
		System.out.println("input the 3rd Number : " +c);
		if((a>b)&&(a>c)){
			System.out.println("The Greatest :" +a);
		}
		 else if(b>c){
			System.out.println("The Greatest :" +b);			
		 }
		 else{
			System.out.println("The Greatest :" +c);
       		}
 
	}

}

package conditionalOperator;

import java.util.Scanner;

public class VerifyPositiveNegetiveNum {

	public static void main(String[] args) {

		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("TestData");
		num = sc.nextInt();
		if(num >0){
		System.out.println("input Number :" + num + "---Positive Number");
		}
		else if(num <0){
			System.out.println("input Number :" + num + "---Negetive Number");
		}
		else{
			System.out.println("input number is zero");
		}
		sc.close();
	}

}

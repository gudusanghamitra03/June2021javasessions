package oops_Inheritance;

public class Car extends Vehicle{
	
	int price = 100;
	
	/*private void fuel(){
		System.out.println("Car ----fuel");
	  }*/

	public static void testing()
	{
		System.out.println("Car----Testing");
	}
	
	public void start(){
		System.out.println("car-----start");
	}

	public void stop(){
		System.out.println("car-----stop");
	}
	
	public void refuel(){
		System.out.println("car-----refuel");
	}
	@Override
	public void airbags(){
		System.out.println("Car----Airbags");
	}
}

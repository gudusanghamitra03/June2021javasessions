package oops_Inheritance;

public class BMW extends Car{

int price=500;

@Override
	public void start(){
		System.out.println("BMW-----start");
	}

	public void autoparking(){
		System.out.println("BMW-----Autoparking");
	}
	
	public static void testing()
	{
		System.out.println("BMW----Testing");
	}
	@Override
	public void airbags(){
		System.out.println("BMW----Airbags");
	}
	
/*	private void fuel(){
		System.out.println("Car ----fuel");
	  }*/
}

package oops_Inheritance;

public class Test_Car {

	public static void main(String[] args) {
	//	final int i=10;
		
		final int days = 7;
		System.out.println(days * 100);
		
		
		BMW b1 = new BMW();
		b1.start(); //overridden
		b1.autoparking();//individual
		b1.stop();// inherited
		b1.refuel();// inherited
		b1.airbags();
		b1.engine();
		//b1.testing();//
		System.out.println(b1.price);
		
		Car.testing();
		BMW.testing();
		
		Car c = new Car();
        c.start();
        c.refuel();
        c.stop();
        
        Car c1 = new BMW();
        c1.start();
        c1.stop();
        c1.airbags();
        c1.refuel();
        
        Vehicle v1 = new BMW();
        v1.airbags();
        v1.engine();
	}

}

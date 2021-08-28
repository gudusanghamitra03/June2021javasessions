package oops_interface;

public interface USMedical {
	
	public void physioService();
	
	public void cardioService();
	
	public void emergencyService();
	
	public void gynecService();
	
	public static void Billing(){
		System.out.println("US-----Billing");
	}
	
	default void getVaccine(){
		System.out.println("US-----getVaccine");
	}

}

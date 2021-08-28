package oops_interface_assignmets;

public interface webpage extends W3C{

	public void header();
	
	public void title();
	
	public void search();
	
	public static void verify()
	{
		System.out.println("Verify Login Details");
	}
	
	default void Validation(){
		System.out.println("Validate field details");
	}
}

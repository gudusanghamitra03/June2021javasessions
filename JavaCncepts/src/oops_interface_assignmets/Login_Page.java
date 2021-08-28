package oops_interface_assignmets;

public class Login_Page extends PageDesign implements webpage,mobilePage {
	
	@Override
	public void header() {
		System.out.println("Application version details");	
	 }
	@Override
	public void title() {
		System.out.println("Java interface learning title");
	}
	@Override
	public void search() {
		System.out.println("Application content serach");
		
	}
	@Override
	public void Login() {
		System.out.println("Mobile page Login");
	}
	
	@Override
	public void createAccount() {
		System.out.println("Create Account for using the Application ");
		
	}
	@Override
	public void SearchElement() {
		System.out.println("Search Element details in login page");
		
	}
	@Override
	public void CustomElement() {
		System.out.println("Custom Element details in login page");
		
	}
	@Override
	public void Specifications() {
		System.out.println("Project specificatons details");
		
	}
	
	
	
}

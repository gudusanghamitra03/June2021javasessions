package oops_interface_assignmets;

public class Home_page extends PageDesign implements webpage,mobilePage {

	public void createAccount(){
		
		System.out.println("Create Account details");
		
	  }
	public void mainPageContent(){
		System.out.println("Main page content details");
	}
	public void signIn(){
		System.out.println("Enter UN and Pswd for signin");
	}

	public void header() {
		System.out.println("Home page header ");
		
	}
	@Override
	public void title() {
		System.out.println("Home page project title ");
	}
	@Override
	public void search() {
		System.out.println("Search bar in home page");
		
	}
	@Override
	public void Login() {
		System.out.println("Login link is available ");
		
	}
	@Override
	public void SearchElement() {
		System.out.println("Search Element details");
		
	}
	@Override
	public void CustomElement() {
		System.out.println("Custom Element details");
		
	}
	@Override
	public void Specifications() {
		System.out.println("Project Specification details");
		
	}
	
	
	
}

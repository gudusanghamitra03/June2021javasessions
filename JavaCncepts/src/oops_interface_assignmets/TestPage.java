package oops_interface_assignmets;

public class TestPage {

	public static void main(String[] args) {
		Login_Page lp = new Login_Page();
		lp.Coverpage();
		lp.createAccount();
		lp.CustomElement();
		lp.fontDetails();
		lp.header();
		lp.Login();
		lp.Logo();
		lp.Coverpage();
		lp.search();
		lp.SearchElement();
		lp.Specifications();
		lp.Validation();
		
		System.out.println("************************************");
		System.out.println("************************************");
		System.out.println("************************************");
		
		
		Home_page hp = new Home_page();
		hp.Coverpage();
		hp.createAccount();
		hp.CustomElement();
		hp.fontDetails();
		hp.Login();
		hp.Logo();
		hp.mainPageContent();
		hp.search();
		hp.SearchElement();
		hp.signIn();
		hp.Specifications();
		hp.title();
		hp.Validation();
		
 
	}

}

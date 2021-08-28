package oops_abstraction;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.doLogin("admin","admin1234");
		lp.ForgotPswd();
		lp.header();
		lp.Logo();
		lp.pageURL();
		lp.title();
		LoginPage.business();
		Page.business();
		
		Page p = new LoginPage();
		 p.Logo();
		 p.pageURL();
		 p.title();
		 p.header();
		 
		

	}

}

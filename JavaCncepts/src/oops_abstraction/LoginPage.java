package oops_abstraction;

public class LoginPage extends Page{
	
	public LoginPage(){
		System.out.println("LP --- Default Constructor");
	}
    
	public LoginPage(int timeout){
		System.out.println("Launch LP within " +timeout);
	}

	@Override
	public void header() {
		System.out.println("Lp-----Header");
		
	}

	@Override
	public void title() {
		System.out.println("LP-----title");
		
	}
	public void ForgotPswd(){
		System.out.println("LoginPage --- forgot Password");
		
	}
   public void doLogin(String Username,String Password){
	   System.out.println("Login with:" +Username +":" +Password );
   }

   public static void business(){
	   System.out.println("Lp--Business");
   }
}

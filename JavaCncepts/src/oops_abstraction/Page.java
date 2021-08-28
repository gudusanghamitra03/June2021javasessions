package oops_abstraction;

public abstract class Page {
	
	public Page(){
		System.out.println("Page default constructor--- Launch App page");
	}
	
	public Page(int timeout){
		System.out.println("Launch parameter with in " +timeout );
	}
	
	public abstract void header();
	
	public abstract void title();
	
	public void pageURL(){
		System.out.println("https://www.xyz.com");
	}
	public final void Logo(){
		System.out.println("Application Logo");
	}

	public static void business(){
		System.out.println("Page Business");
	}
}

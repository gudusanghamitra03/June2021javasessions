package oops_Inheritance_assignment;

public class Test_College {

	public static void main(String[] args) {
		
	   //Using Final keyword	
		
		final int mba_seat= 500;
		System.out.println("mba_seat " + mba_seat);
		
		//call Non static method using object
		
		IITBombay ib  = new IITBombay();
		ib.admissionCriteria();
		ib.council();
		ib.courses();
		ib.Facilities();
		ib.freeCourses();
		ib.Internship();
		ib.PGProgrames();
		ib.ResearchProgrames();
		ib.UGProgrames();
		
		
		//ib.Registration(); //call static method using object, warning will come
		ib.PHD();
		
		//call static methods using class
		College.Registration();
		IITBombay.Registration();
		
		Symbiosis_Pune sp = new Symbiosis_Pune();
		sp.admissionCriteria();
		sp.courses();
		sp.PGProgrames();
		
		College c = new College();
		c.admissionCriteria();
		c.council();
		c.courses();
		c.Facilities();
		c.Internship();
		c.freeCourses();
		
		//upcasting
		
		College c1 = new IITBombay();
		c1.admissionCriteria();
		c1.council();
		c1.courses();
		c1.Facilities();
		
		//Downcasting
		//Symbiosis_Pune sp1 = (Symbiosis_Pune) new College();// java.lang .classcast exception occur
		//sp1.admissionCriteria();
		
		
		

	}

}

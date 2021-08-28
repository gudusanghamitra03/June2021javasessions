package oops_Inheritance_assignment;

public class Symbiosis_Pune extends College{

	int mba_seat= 100;
	
	@Override 
	   public void admissionCriteria(){
		   System.out.println("Merit based and Entrance test(SET)basis ----SymbiosisPune");
	   }
	   public void ResearchProgrames(){
		   System.out.println("PHD available");
	   }
	   public void PGProgrames(){
		   System.out.println("MBA,PGDM are available");
	   }
	   @Override
	   public void courses(){
		   System.out.println("Law, Management,Computer Studies,Health Sciences,Engineering, and Architecture & Design");
		  
	   }
}

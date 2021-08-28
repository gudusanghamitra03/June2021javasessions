package oops_Inheritance_assignment;

public class IITBombay extends College{
	
	int mba_seat = 50;

      @Override
	  public void council(){
		   System.out.println(" IIT Bombay--- Councilling");
	   }
	  @Override 
	   public void admissionCriteria(){
		   System.out.println("Merit based and Entrance test basis ----IITBombay");
	   }
	  
	  public static void Registration(){
		   System.out.println("IITBombay Registration");
	   }
	   public void PGProgrames(){
		   System.out.println("Mtech,Mphil, MBA,MSC are available");
	   }
	   
	   public void ResearchProgrames(){
		   System.out.println("PHD available");
	   }
	   public void UGProgrames(){
		   System.out.println("BTech,Dual degree are avilable");
	   }
	   
	
}

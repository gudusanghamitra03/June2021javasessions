package oops_interface;

public class fortisHospital implements USMedical,UKMedical,IndianMediacl{

	public static void main(String[]args){
		
		
//Create object of Class
		
		fortisHospital fh = new fortisHospital();
		fh.cardioService();
		fh.emergencyService();
		fh.ENTServices();
		fh.gynecService();
		fh.neurologyServices();
		fh.oncologyServices();
		fh.physioService();
		fh.radiologyServices();
		
		USMedical.Billing();
		fortisHospital.Billing();
		
		fh.getVaccine();
	    
		
	//UPCasting

	USMedical us = new fortisHospital();
	us.cardioService();
	us.emergencyService();
	us.gynecService();
	us.physioService();
	
	
	UKMedical uk = new fortisHospital();
	uk.emergencyService();
	uk.ENTServices();
	uk.oncologyServices();
	
	IndianMediacl im = new fortisHospital();
	im.emergencyService();
	im.neurologyServices();
	im.radiologyServices();
	
	
	}
  //Down casting not allowed	
	
//USMedical
	
	@Override
	public void physioService() {
		System.out.println("FH-----PhysioServices");
		
	}

	@Override
	public void cardioService() {
		System.out.println("FH-----CardioServices");
		
	}
	
	@Override
	public void gynecService() {
		System.out.println("FH-----gynecServices");
		
	}
//common method
	@Override
	public void emergencyService() {
		System.out.println("FH-----emergencyServices");
	}


//UKMedical 

	@Override
	public void ENTServices() {
		System.out.println("FH-----ENTServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH-----oncologyServices");
		
	}
//IndianMedical

	@Override
	public void radiologyServices() {
		System.out.println("FH-----radiologyServices");
	}


	@Override
	public void neurologyServices() {
		System.out.println("FH-----neurologyServices");
		
	}

//fortisHospital
	public void MedicalInsurance(){
		System.out.println("FH----MedicalInsurance");
		
	}
	
	public void MedicalTraining(){
		System.out.println("FH----MedicalTraining");
	}
	//Method Hiding
	public static void Billing(){
		System.out.println("FH----Billing");
	}
@Override	
	public void getVaccine(){
		System.out.println("FH-----getVaccine");
	}
	}

	
	


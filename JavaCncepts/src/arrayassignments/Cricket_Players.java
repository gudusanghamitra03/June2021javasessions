package arrayassignments;

public class Cricket_Players {
	

	public static void main(String[] args) {
	Players[] obj = new Players[5];
	
//Actual Player object	
    obj[0] = new Players();
    obj[1]= new Players();
    obj[2]= new Players();
    obj[3]= new Players();
    obj[4]= new Players();
	
//Assign Data
	obj[0].setData("Sachin",39,"MumbaiTeam","09-08-1980",'M',344.90,true);
	obj[1].setData("kholi",33,"BangaloreTeam","09-08-1987",'M',444.20,true);
	obj[2].setData("Resab",32,"MumbaiTeam","09-08-1988",'M',144.90,true);
	obj[3].setData("Dhoni",41,"ChennaiTeam","09-08-1978",'M',548.90,true);
	obj[4].setData("Raina",40,"DelhiTeam","09-08-1979",'M',234.90,true);
//
	System.out.println("Player object1:");
	obj[0].showData();
	//for(int i=0;i<obj.length;i++){
	//	System.out.println(i+":"+obj[i]);
	//}
	System.out.println("Player object2:");
	obj[1].showData();
	System.out.println("Player object3:");
	obj[2].showData();
	System.out.println("Player object4:");
	obj[3].showData();
	System.out.println("Player object5:");
	obj[4].showData();
	
	}
}
class Players{
	String name;
	int age;
	String team_name;
	String dob;
	char gender;
	double strikerate;
	boolean isActve;
	
	public void setData(String n,int a,String t, String d,char g,double s,boolean isActive){
		name = n;
		age= a;
		team_name= t;
		dob= d;
		gender= g;
		strikerate= s;
		isActve= true;
		
	}
	public void showData(){
		System.out.println("Player Details: ");
		System.out.println("name :"+name+ " "+"age:"+ age +" "+ "team_name:"+team_name+" "+"dob:"+dob+" "+"gender:"+gender+" "+"strikerate:"+strikerate+" "+true);
}
}
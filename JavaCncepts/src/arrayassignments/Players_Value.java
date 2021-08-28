package arrayassignments;

public class Players_Value {

	public static void main(String[] args) {
		Players[] obj = new Players[5];
		for(int i=0; i<obj.length;i++){
			System.out.println(i+" "+obj[i]);
		}
		obj[0].setData("Sachin",39,"MumbaiTeam","09-08-1980",'M',344.90,true);
		obj[1].setData("kholi",33,"BangaloreTeam","09-08-1987",'M',444.20,true);
		obj[2].setData("Resab",32,"MumbaiTeam","09-08-1988",'M',144.90,true);
		obj[3].setData("Dhoni",41,"ChennaiTeam","09-08-1978",'M',548.90,true);
		obj[4].setData("Raina",40,"DelhiTeam","09-08-1979",'M',234.90,true);
	}

}

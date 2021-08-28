package lombokTest;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setName("Sanghamitra");
		e1.setAge(32);
		e1.setCity("BBSR");
		
		System.out.println(e1.getName() + " " + e1.getAge() + " " +e1.getCity());

	}

}

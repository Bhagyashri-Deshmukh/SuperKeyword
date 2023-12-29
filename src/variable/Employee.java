package variable;

public class Employee extends Person {

	private int id=2;
	private String name="Yati";
	
	public void printEmployeeInformation() {
		
		System.out.println("Name of Person is : "+super.name);
		System.out.println("Name of Employee is : "+name);
	}
}

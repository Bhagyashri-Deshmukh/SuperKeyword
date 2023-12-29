package constructor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
	}

}

class Person{

	public Person() {
		super();
		// TODO Auto-generated constructor stub\
		System.out.println("This is person class constructor.");
	}

}

class Employee extends Person{

	public Employee() {
		
		// calling super class constructor using super()
		super();
		// TODO Auto-generated constructor stub\
		System.out.println("This is employee class constructor.");
	}

}

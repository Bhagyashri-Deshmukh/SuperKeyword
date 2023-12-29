package methods;

public class Employee extends Person {

	public int id=101;
	public String name="Kirti";
	
	public void display() {
		
		System.out.println("This is employee class.");
	}
	
	public void show() {
		
		display();
		
		super.display();
	}
}

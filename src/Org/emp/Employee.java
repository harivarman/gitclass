package Org.emp;

public class Employee {
	private void empID() {
		System.out.println("Emp ID");
	}
	private void empName() {
		System.out.println("Emp Name");
	}
	private void empno() {
		System.out.println("Emp Number");

	}
		
	public static void main(String[] args) {
		
		Employee E1 = new Employee();
		
		E1.empID();
		E1.empName();
		E1.empno();
		
	}
	
	
}

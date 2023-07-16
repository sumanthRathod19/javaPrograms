package Immutable;

public class EmployeeImmutable {

public static void main(String[] args) {
	final Address address=new Address(100, "Warangal");
	final Employee employee=new Employee("Sumanth",123,address);
	
	//before changes
	System.out.println(employee.toString());
	

}	

}

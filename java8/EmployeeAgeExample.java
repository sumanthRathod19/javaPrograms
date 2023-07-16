package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAgeExample {
	
	/* empList name, id, city, age
	 * 
	 * age>25 want these op
	 * 
	 * empList.stream()
	 * .filter(emp->emp.getAge()>25)
	 * .collect(Collectors.toList()):
	 * 
	 * 
	 * filter is used  to reduce the exiting empList based on some predicate(getAge()) 
	 * map is used to operate on each and every obj
	 */

	public static void main(String[] args) {
		List<Employee1> empList= createEmployeeList();
		
List<Employee1> outPut1 = empList.stream().filter(emp->emp.getAge()>25)
		.collect(Collectors.toList());
	//	outPut.forEach(emp->System.out.println(empList));

List<String> outPut	= empList.stream().map(Employee1::getName)
		.collect(Collectors.toList());
		outPut.forEach(emp->System.out.println(emp));

	}

	public static List<Employee1> createEmployeeList() {
		
		List<Employee1> empList=new ArrayList<Employee1>();
		Employee1 e1=new Employee1("Sumanth","1","warangal",21);
		Employee1 e2=new Employee1("Raj","2","warangal",23);
		Employee1 e3=new Employee1("Rishab","3","warangal",25);
		Employee1 e4=new Employee1("Dev","4","warangal",27);
		Employee1 e5=new Employee1("Anvesh","5","warangal",29);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		return empList;
	}

}

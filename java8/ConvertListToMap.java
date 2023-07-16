package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {
		
List<Employee> empList=new ArrayList();

	createEmployeeList(empList);
	Map<String, List<Employee>> empMap=
	empList.
	stream().
	collect(Collectors.groupingBy(Employee::getCity));
	empMap.forEach((key,value)->
	System.out.println("city: "+ key+" Employees: "+value));
	
	}

	private static void createEmployeeList(List<Employee> empList) {
		
		Employee e1=new Employee();
		e1.setName("Sumanth");
		e1.setCity("Hyderabad");
		e1.setId("1");
		
		Employee e2=new Employee();
		e2.setName("Narsimha");
		e2.setCity("kadapa");
		e2.setId("2");
		
		Employee e3=new Employee();
		e3.setName("Guru");
		e3.setCity("Ap");
		e3.setId("3");
		
		Employee e4=new Employee();
		e4.setName("Laxman");
		e4.setCity("Bagalore");
		e4.setId("4");
		
		Employee e5=new Employee();
		e5.setName("Sagar");
		e5.setCity("Hyderabad");
		e5.setId("5");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		
	}

}

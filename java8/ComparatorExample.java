package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList();

		createEmployeeList(empList);
		//Employee list before sorting: 
		System.out.println("Employee list before sorting: ");
		empList.forEach(emp->System.out.println(emp.getName()+"-"+emp.getCity()));
		System.out.println();
		
		//Employee Lis after sorting:
		System.out.println("Employee Lis after sorting: ");
		empList.sort(Comparator.comparing(Employee::getName));
		empList.forEach(emp-> System.out.println(emp.getName()+"-"+emp.getCity()));
		System.out.println();
		
		//Employee List after reverse sorting: 
		System.out.println("Employee List after reverse sorting: ");
		empList.sort(Comparator.comparing(Employee::getName).reversed());
		empList.forEach(emp-> System.out.println(emp.getName()+"-"+emp.getCity()));
		System.out.println();
		
		//Employee List after groupBy sorting: 
		System.out.println("Employee List after groupBy sorting: ");
		Comparator<Employee> groupByComparator=
				Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getCity);
		System.out.println();
		empList.sort(groupByComparator);
		empList.sort(Comparator.comparing(Employee::getName));
		empList.forEach(emp-> System.out.println(emp.getCity()+"-"+emp.getName()));
		
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



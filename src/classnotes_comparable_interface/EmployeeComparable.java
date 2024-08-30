package classnotes_comparable_interface;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable {
	public static void main(String[] args) 
	{
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(222, "John", 17000.90));
		emp.add(new Employee(444, "Aryan", 18000.90));
		emp.add(new Employee(111, "Zuber", 19000.90));
		emp.add(new Employee(333, "Rahul", 15000.90));
		
		Collections.sort(emp);
		
		emp.forEach(e -> System.out.println(e));
	}
}

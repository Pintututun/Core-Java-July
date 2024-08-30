package classnotes_collections_TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String[] args)
	{
		System.out.println("Sorting name -> Ascending Order");
					
		TreeMap<Employee,String> tm1 = new TreeMap<Employee,String>( new FirstComparator());

		tm1.put(new Employee(101, "Zaheer", 24),"Hyderabad");
		tm1.put(new Employee(201, "Aryan", 27),"Jamshedpur");
		tm1.put(new Employee(301, "Pooja", 26),"Mumbai");
		
		System.out.println(tm1);

	  System.out.println("----------------------------------------");

		System.out.println("Sorting name -> Descending Order");
		
		TreeMap<Employee,String> tm2 = new TreeMap<Employee,String>(new SecondComparator());

		tm2.put(new Employee(101, "Zaheer", 24),"Hyderabad");
		tm2.put(new Employee(201, "Aryan", 27),"Jamshedpur");
		tm2.put(new Employee(301, "Pooja", 26),"Mumbai");

		System.out.println(tm2);

        System.out.println("----------------------------------------");
		System.out.println("Sorting Age -> Ascending Order");

		TreeMap<Employee,String> tm3 = new TreeMap<Employee,String>(new ThirdComparator());
		tm3.put(new Employee(101, "Zaheer", 24),"Hyderabad");
		tm3.put(new Employee(201, "Aryan", 27),"Jamshedpur");
		tm3.put(new Employee(301, "Pooja", 26),"Mumbai");

		System.out.println(tm3);

		System.out.println("----------------------------------------");
		System.out.println("Sorting Age ->  Descending Order");
		TreeMap<Employee,String> tm4 = new TreeMap<Employee,String>(new FourthComparator());

		tm4.put(new Employee(101, "Zaheer", 24),"Hyderabad");
		tm4.put(new Employee(201, "Aryan", 27),"Jamshedpur");
		tm4.put(new Employee(301, "Pooja", 26),"Mumbai");
		
		 System.out.println(tm4);
	}
}
//for sorting name in ascending order
class FirstComparator implements Comparator<Employee> 
{
	@Override 
	public int compare(Employee e1, Employee e2)
	{
		return e1.name.compareTo(e2.name);
	}
}

//for sorting name in descending order
class SecondComparator implements Comparator<Employee>
{
	@Override 
	public int compare(Employee e1, Employee e2)
	{
		return - (e1.name).compareTo(e2.name);  
	}
}

//for sorting age in ascending order
class ThirdComparator implements Comparator<Employee> 
{
	@Override 
	public int compare(Employee e1, Employee e2)
	{
		return e1.age - e2.age;    
	}
}


//for sorting age in descending order
class FourthComparator implements Comparator<Employee> 
{
	@Override 
	public int compare(Employee e1, Employee e2)
	{
		return - (e1.age - e2.age);
	}
}

//Employee class
class Employee 
	{
	 int id;
	 String name;
	 Integer age;

	public Employee(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override 
	public String toString()  
	{
		return " " + this.id + " " + this.name + " "+ this.age;
	}
}
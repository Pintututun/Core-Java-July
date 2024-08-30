package classNotes_collection_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
	public static void main(String[] args) {
		System.out.println("Sorting name -> Ascending Order");

		TreeSet<Employee> ts1 = new TreeSet<Employee>(new FirstComparator());
		ts1.add(new Employee(101, "Zaheer", 24));
		ts1.add(new Employee(201, "Aryan", 27));
		ts1.add(new Employee(301, "Pooja", 26));
		ts1.forEach(i -> System.out.println(i));

		System.out.println("----------------------------------------");
		System.out.println("Sorting name -> Descending Order");

		TreeSet<Employee> ts2 = new TreeSet<>(new SecondComparator());
		ts2.add(new Employee(101, "Zaheer", 24));
		ts2.add(new Employee(201, "Aryan", 27));
		ts2.add(new Employee(301, "Pooja", 26));
		ts2.forEach(i -> System.out.println(i));

		System.out.println("----------------------------------------");
		System.out.println("Sorting Age -> Ascending Order");

		TreeSet<Employee> ts3 = new TreeSet<>(new ThirdComparator());
		ts3.add(new Employee(101, "Zaheer", 24));
		ts3.add(new Employee(201, "Aryan", 27));
		ts3.add(new Employee(301, "Pooja", 26));
		ts3.forEach(i -> System.out.println(i));

		System.out.println("----------------------------------------");
		System.out.println("Sorting Age ->  Descending Order");
		TreeSet<Employee> ts4 = new TreeSet<>(new FourthComparator());

		ts4.add(new Employee(101, "Zaheer", 24));
		ts4.add(new Employee(201, "Aryan", 27));
		ts4.add(new Employee(301, "Pooja", 26));
		ts4.forEach(i -> System.out.println(i));
	}
}

// for sorting name in ascending order
class FirstComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}

// for sorting name in descending order
class SecondComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return -(e1.name).compareTo(e2.name);
	}
}

// for sorting age in ascending order
class ThirdComparator implements Comparator<Employee> {
	@Override 
	public int compare(Employee e1, Employee e2)
	{
		return e1.age - e2.age;
	}
}

// for sorting age in descending order
class FourthComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return -(e1.age - e2.age);
	}
}

// Employee class
class Employee {
	Integer id;
	String name;
	Integer age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return " " + this.id + " " + this.name + " " + this.age;
	}
}

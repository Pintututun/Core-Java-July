package classNotes_collection_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

//Employee class
class EmployeeDetails {
	Integer id;
	String name;
	Integer age;

	public  EmployeeDetails(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return " " + this.id + " " + this.name + " " + this.age;
	}
}
public  class TreeSetDemo5  {
	public static void main(String[] args) {
		System.out.println("Sorting name -> Ascending Order");

		TreeSet<EmployeeDetails> ts1 = new TreeSet<EmployeeDetails>((e1,e2)->e1.name.compareTo(e2.name));
		ts1.add(new EmployeeDetails(101, "Zaheer", 24));
		ts1.add(new EmployeeDetails(201, "Aryan", 27));
		ts1.add(new EmployeeDetails(301, "Pooja", 26));
		ts1.forEach(i -> System.out.println(i));

		System.out.println("----------------------------------------");
		System.out.println("Sorting name -> Descending Order");

		TreeSet<EmployeeDetails> ts2 = new TreeSet<>((e1,e2)->-e1.name.compareTo(e2.name));
		ts2.add(new EmployeeDetails(101, "Zaheer", 24));
		ts2.add(new EmployeeDetails(201, "Aryan", 27));
		ts2.add(new EmployeeDetails(301, "Pooja", 26));
		ts2.forEach(i -> System.out.println(i));

		System.out.println("----------------------------------------");
		System.out.println("Sorting Age -> Ascending Order");

		TreeSet<EmployeeDetails> ts3 = new TreeSet<>((e1,e2)->e1.age-e2.age);
		ts3.add(new EmployeeDetails(101, "Zaheer", 24));
		ts3.add(new EmployeeDetails(201, "Aryan", 27));
		ts3.add(new EmployeeDetails(301, "Pooja", 26));
		ts3.forEach(i -> System.out.println(i));

		System.out.println("----------------------------------------");
		System.out.println("Sorting Age ->  Descending Order");
		TreeSet<EmployeeDetails> ts4 = new TreeSet<>((e1,e2)->-(e1.age-e2.age));

		ts4.add(new EmployeeDetails(101, "Zaheer", 24));
		ts4.add(new EmployeeDetails(201, "Aryan", 27));
		ts4.add(new EmployeeDetails(301, "Pooja", 26));
		ts4.forEach(i -> System.out.println(i));
	}
}





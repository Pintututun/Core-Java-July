package collection_program_july17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog> {
	 String name;
	 int age;
	 Dog() {
	 }
	 Dog(String n, int a) {
	 name = n;
	 age = a;
	 }
	 public int compareTo(Dog d) {
	 return (name).compareTo(d.name);
	 }
	 public int compare(Dog d, Dog d1) {
	 return d.age - d1.age;
	 }
	}
public class Example {
	public static void main(String args[]) {
		 List<Dog> list = new ArrayList<Dog>();
		 list.add(new Dog("Shaggy", 3));
		 list.add(new Dog("Lacy", 2));
		 list.add(new Dog("Roger", 10));
		 list.add(new Dog("Tommy", 4));
		 list.add(new Dog("Tammy", 1));
		 Collections.sort(list);
		 for (Dog a : list)
		 System.out.print(a.name + ", ");
		 Collections.sort(list, new Dog());
		 System.out.println(" ");
		 for (Dog a : list)
		 System.out.print(a.name + ":" + a.age + ", ");
		 }
}

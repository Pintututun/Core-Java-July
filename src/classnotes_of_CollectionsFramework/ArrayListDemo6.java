package classnotes_of_CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo6 {
	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<Object>(); //Generic type
		al.add(12);
		al.add("Ravi");
		al.add(12);		
		al.add(3,"Hyderabad"); //add(int index, Object o)method of List interface
		al.add(1,"Naresh");
		al.add(null);
		al.add(11);
		System.out.println(al);
	}
}

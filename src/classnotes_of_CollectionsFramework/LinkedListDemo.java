package classnotes_of_CollectionsFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String args[])
	 { 
	      List<Object> list=new LinkedList<>();
		  list.add("Ravi");
		  list.add("Vijay");
		  list.add("Ravi");
		  list.add(null);
		  list.add(42);
		  
		  System.out.println("0th Position Element is :"+list.get(0));

		 list.forEach(x -> System.out.println(x));
	  }
}

package classnotes_of_CollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo3 {
	public static void main(String[] args) 
	{
		LinkedList<String> city = new LinkedList<> ();
         city.add("Kolkata");
		 city.add("Bangalore");
		 city.add("Hyderabad");
		 city.add("Pune");
		 System.out.println(city);   

		ListIterator<String> lt = city.listIterator();

       while(lt.hasNext())
		  {
			String x =  lt.next();

			if(x.equals("Kolkata"))
			{
                 lt.remove();
			}
			else if(x.equals("Hyderabad"))
			{
                 lt.add("Ameerpet");
			}
			else if(x.equals("Pune"))
			{
                 lt.set("Mumbai");
			}
		}
		city.forEach(System.out::println);
	}
}

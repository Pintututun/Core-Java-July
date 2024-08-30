package classnotes_of_CollectionsFramework;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ObjectRetrievalUsingVariousTools {
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>();
		v.add("Hyderabad");
		v.add("Vijaywada");
		v.add("Chennai");
		v.add("Bangalore");
		Collections.sort(v); //sorting
		
		System.out.println("Fetching the String Object using Enumeration :");
	    Enumeration<String> ele = v.elements();
	    while(ele.hasMoreElements())
	    {
	    	System.out.println(ele.nextElement());
	    }
	    
	    System.out.println("Fetching the String Object using Ordinary for loop :");
	    
	    for(int i =0; i<v.size(); i++)
	    {
	    	System.out.println(v.get(i));
	    }
		
	    System.out.println("Fetching the String Object using for each loop :");
	    for(String city : v)
	    {
	    	System.out.println(city);
	    }
	    System.out.println("Fetching the String Object using Iterator interface:");
	     
	    Iterator<String> itr = v.iterator();
	    
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println("Fetching the String Object using ListIterator interface:");
	    
	         ListIterator<String> listItr = v.listIterator();
	         System.out.println("FORWARD DIRECTION");
	         
	         while(listItr.hasNext())
	         {
	        	 System.out.println(listItr.next());
	         }
	         
	         System.out.println("BACKWARD DIRECTION");
             while(listItr.hasPrevious())
             {
            	 System.out.println(listItr.previous());
             }
             
         System.out.println("Fetching the String Object using ForEach Method");
         
         v.forEach( x-> System.out.println(x.toUpperCase()));
         
         
         System.out.println("Fetching the String Object using Method Reference");
         
          v.forEach(System.out::println);   //Method reference       
         
	}
}

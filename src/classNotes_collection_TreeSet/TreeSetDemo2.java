package classNotes_collection_TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) 
	{
		Set<String> t = new TreeSet<>();  
		t.add("6"); 
		t.add("5");
		t.add("4");
		t.add("2");
		t.add("9");	
		Iterator<String> iterator = t.iterator();
		iterator.forEachRemaining(x -> System.out.println(x));
		//From 1.8 to replace hasNext() and next() method
	}
}

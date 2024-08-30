package classnotes_collections_TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) 
	{
		TreeMap t = new TreeMap(); 
		t.put(4,"Ravi");
		t.put(7,"Aswin");
		t.put(2,"Ananya");
		t.put(1,"Dinesh");
		t.put(9,"Ravi");	
		t.put(3,"Ankita");
		t.put(5,null);
		
		System.out.println(t);
	}
}

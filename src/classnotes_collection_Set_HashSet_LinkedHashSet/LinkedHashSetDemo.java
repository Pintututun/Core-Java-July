package classnotes_collection_Set_HashSet_LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String args[])
	{ 
		  LinkedHashSet<String> lhs=new LinkedHashSet<>();
		  lhs.add("Ravi");
		  lhs.add("Vijay");
		  lhs.add("Ravi");
		  lhs.add("Ajay");
		  lhs.add("Pawan");
		  lhs.add("Shiva");
		  lhs.add(null);
		  lhs.add(null);
		  lhs.add("Ganesh");
          
		  lhs.forEach(str -> System.out.println(str));	   
	}
}

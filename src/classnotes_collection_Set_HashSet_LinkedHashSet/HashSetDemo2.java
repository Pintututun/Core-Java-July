package classnotes_collection_Set_HashSet_LinkedHashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
	public static void main(String[] args) 
	{
		 boolean[] ba = new boolean[6]; 

            Set s = new HashSet();
            ba[0] = s.add("a");
            ba[1] = s.add(42);
            ba[2] = s.add("b");
            ba[3] = s.add("a"); 
            ba[4] = s.add("new Object()");
			ba[5] = s.add(new Object());

            for(int x = 0; x<ba.length; x++)      
                 System.out.println(ba[x]+"    "); 

		if(s.contains(42)) //Searching a particular object in the Set
			{
				System.out.println("Object 42 is available ...");
			}
			else
			{
				System.out.println("42 is not available ...");
			}
			
         System.out.println("Fetching the elements of HashSet");            
			s.forEach(str -> System.out.println(str)); 
	}
}

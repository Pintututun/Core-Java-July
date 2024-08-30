package classnotes_collection_Set_HashSet_LinkedHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	 public static void main(String [] args)
     {
		 ArrayList<Integer> al = new ArrayList<>();
               al.add(12);
		 al.add(9);
		 al.add(1);
		 al.add(12);

       HashSet<Integer> hs = new HashSet<>(al);         
		 System.out.println(hs);

      }
}

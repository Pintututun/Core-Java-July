package classnotes_collection_Set_HashSet_LinkedHashSet;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String args[])
	 { 
		 HashSet<Integer> hs = new HashSet<>();
			hs.add(67);
			hs.add(89);
			hs.add(33);
			hs.add(45);
			hs.add(12);
			hs.add(35);		
			hs.forEach(str-> System.out.println(str));
		}
}

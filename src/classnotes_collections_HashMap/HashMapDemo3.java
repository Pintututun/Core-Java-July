package classnotes_collections_HashMap;

import java.util.HashMap;

public class HashMapDemo3 {
	public static void main(String args[]) 
	  {
			HashMap<Integer,String> map = new HashMap<>(10,8.5f);
			map.put(1, "Java");
			map.put(2, "is");
			map.put(3, "best");
			map.remove(3);  //will remove the complete Entry
			String val=(String)map.get(3);
			System.out.println("Value for key 3 is: " + val);
			map.forEach((k,v)->System.out.println(k +" : "+v));
	   }
}

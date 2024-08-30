package classnotes_collections_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] a) 
    {
         Map<String,String> map = new HashMap<>();
		   map.put("Ravi", "12345");  //Ravi is key and 12345 is value
		   map.put("Rahul", "12345");
		   map.put("Aswin", "5678");
		   map.put(null, "6390");
		   map.put("Ravi","1529");

		   System.out.println(map); //{}

         System.out.println(map.get(null));  //6390
		   System.out.println(map.get("Virat"));  //null becoz key is not available
		   map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v)); 
		   
		                 
    }
}

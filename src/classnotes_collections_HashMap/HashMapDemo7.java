package classnotes_collections_HashMap;

import java.util.HashMap;

public class HashMapDemo7 {
	public static void main(String args[])
	{		
		HashMap<Integer, String> hm1 = new HashMap<>();

		hm1.put(1, "Ravi");
		hm1.put(2, "Rahul");
		hm1.put(3, "Rajen");

		HashMap<Integer, String> hm2	= new HashMap<>(hm1);

		System.out.println("Mapping of HashMap hm1 are : "	+ hm1);
	
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
	}
}

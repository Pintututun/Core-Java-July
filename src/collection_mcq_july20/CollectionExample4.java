package collection_mcq_july20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionExample4 {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add("NIT");
		set.add("nit");
		set.add(5.0);
		set.add(5.00);
		set.add(1);
		set.add(1);
		Iterator it = set.iterator();
		while(it.hasNext()) 
		{
			System.out.print(it.next()+" ");
		}
	}
}

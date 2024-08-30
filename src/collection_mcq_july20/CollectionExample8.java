package collection_mcq_july20;

import java.util.HashSet;

public class CollectionExample8 {
	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		set.add(new StringBuffer("nit"));
		set.add(new StringBuffer("nit"));
		System.out.println(set);
		System.out.println(set.size());
	}
}

package collection_mcq_july20;

import java.util.TreeSet;

public class CollectionExample10 {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("Naresh");
		tree.add("Technology");
		System.out.println(tree.tailSet("a"));
	}
}

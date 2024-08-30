package collection_mcq_july20;

import java.util.TreeSet;

public class CollectionExample9 {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("Naresh");
		tree.add("25");
		System.out.println(tree.tailSet("a"));
		System.out.println(tree.tailSet("A"));
		System.out.println(tree.tailSet("0"));

	}
}

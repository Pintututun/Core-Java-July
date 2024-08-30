package collection_program_july19;

import java.util.HashSet;
import java.util.Set;

public class CollectionExample7 {
	public static void main(String[] args) {
		Set<String> tree = new HashSet<>();
		tree.add("25");
		tree.add("Naresh");
		tree.add("37");
		tree.add("A");
		tree.add("37");
		for(String str: tree)
			System.out.print(str+" ");
	}
}

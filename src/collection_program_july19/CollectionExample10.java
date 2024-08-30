package collection_program_july19;

import java.util.ArrayList;

public class CollectionExample10 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("google");
		al.add("Naresh");
		al.add("Information");
		al.add("Technology");
		for(int i=0;i<al.size();i++) 
		{
			System.out.print(al.get(i).substring(0,6));
		}
	}
}

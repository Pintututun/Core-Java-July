package classNotes_Comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringDescending {
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("B.Tech");
		al.add("B.Sc");
		al.add("M.tech");
		al.add("BCA");
		al.add("MCA");
	    
		Comparator<String> cmpDec = (s1, s2)->
		{
			return  - s1.compareTo(s2);
		};
		
		Collections.sort(al, cmpDec);
		al.forEach(x -> System.out.println(x));
	}
}

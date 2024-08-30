package classnotes_of_CollectionsFramework;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethod {
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		v.add("Hyderabad");
		v.add("Vijaywada");
		v.add("Chennai");
		v.add("Bangalore");
		v.add("Ameerpet");
      
                //Anonymous inner class
		Consumer<String> cons = new Consumer<String>() 
		{
			@Override
			public void accept(String t)
			{
				System.out.println(t);		
			}			
		};

		 v.forEach(cons);
	}
}

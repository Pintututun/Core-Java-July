package collection_vector_program;

import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args)
	{   
		Vector<Integer> v = new Vector<>();
		
		for(int i=1; i<=100; i++)
		{
			
          v.add(i);
		}

		System.out.println("Fetching the elements of Vector :");

		for(int i=0; i<v.size(); i++)
		{
			if(i%5==0)
			{
				System.out.println();
			}
			System.out.print(v.get(i)+"\t");
		}			
     }
}

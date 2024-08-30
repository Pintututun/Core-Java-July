package collection_vector_program;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo4 {
	public static void main(String[] args) 
	{
		//starting time for Vector
		long startTime = System.currentTimeMillis();

       Vector<Integer> v = new Vector<>();
		 for(int i=0; i<1000000; i++)
		{
			 v.add(i);
		}
		long endTime = System.currentTimeMillis();

		System.out.println("Time taken by vector :"+(endTime - startTime)+" ms");

		//starting time for ArrayList
		 startTime = System.currentTimeMillis();

       ArrayList<Integer> al = new ArrayList<Integer>();
		 for(int i=0; i<1000000; i++)
		{
			 al.add(i);
		}
		 endTime = System.currentTimeMillis();

		System.out.println("Time taken by ArrayList :"+(endTime - startTime)+" ms");
	}
}

package classNotes_Comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductComparator {
	public static void main(String[] args) 
	{
		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product(222,"Camera",80000.78));
		al.add(new Product(111,"Laptop",85000.78));
		al.add(new Product(333,"Mobile",55000.78));
		al.add(new Product(444,"LED",44000.78));

		//Sorting the Product data based on the id
		Comparator<Product> cmpId = (p1, p2)-> p1.getProductId() - p2.getProductId();				
				
		Collections.sort(al, cmpId);
		System.out.println("SORTING PRODUCT DATA BASED ON ID");
		al.forEach(x -> System.out.println(x));
		
		Comparator<Product> cmpName = (p1,p2) -> p1.getProductName().compareTo(p2.getProductName());
		
		Collections.sort(al, cmpName);
		System.out.println("SORTING PRODUCT DATA BASED ON NAME");
		al.forEach(System.out::println);
	

	}
}

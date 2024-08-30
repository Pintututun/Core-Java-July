package sortingOperationByimplementingComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of products you want:");
	int obj=sc.nextInt();
	ArrayList<Product> products=new ArrayList<>();
	for(int i=1;i<=obj;i++)
	{
		System.out.print("Enter the product number:");
		int proNumber=sc.nextInt();
		System.out.print("Enter the product name:");
		String proName=sc.nextLine();proName=sc.nextLine();
		System.out.print("Enter the product price:");
		Double proPrice=sc.nextDouble();
		products.add(new Product(proNumber, proName, proPrice));
	}
	Collections.sort(products);
	products.forEach(x->System.out.println(x));
	
}
}

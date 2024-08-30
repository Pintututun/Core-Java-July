package sortingOperationUsingComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	ArrayList<Customer> customers=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of customers:");
	int obj=sc.nextInt();
	for(int i=1;i<=obj;i++)
	{
		System.out.print("Enter the customer number:");
		int number=sc.nextInt();sc.nextLine();
		System.out.print("Enter the customer name:");
		String name=sc.nextLine();
		
		System.out.print("Enter the customer bill:");
		double bill=sc.nextDouble();
		customers.add(new Customer(number, name, bill));
		System.out.println("=======================================");
	}
	System.out.println("Sorted using customer name:");
	Collections.sort(customers,new CustomerNameComparator());
	for(Customer customer:customers)
	{
		System.out.println(customer);
	}
	System.out.println("Sorted using customer bill:");
	Collections.sort(customers,new CustomerBillComparator());
	for(Customer customer:customers)
	{
		System.out.println(customer);
	}
	System.out.println("Sorted using customer number:");
	Collections.sort(customers,new CustomerNumberComparator());
	for(Customer customer:customers)
	{
		System.out.println(customer);
	}
	
}
}

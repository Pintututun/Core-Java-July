package collections_arrayList_program3_july18;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Tester {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements want to enter:");
	int option=sc.nextInt();
	Vector<Integer> vc=new Vector<Integer>();
	for(int i=0;i<option;i++)
	{
		System.out.print("Enter the "+(i+1)+" element:");
		Integer element=sc.nextInt();
		vc.add(element);
	}
	System.out.println(vc);
	Duplicates dup=new Duplicates(vc);
	List<Integer> lis=dup.getDuplicatesList();
	System.out.println("After Removing Unique elements:");
	System.out.println(lis);
}
}

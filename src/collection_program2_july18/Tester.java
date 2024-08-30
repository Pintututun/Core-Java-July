package collection_program2_july18;

import java.util.*;
import java.util.Scanner;

public class Tester {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements want to store in array:");
	int option=sc.nextInt();sc.nextLine();
	String[] arr= new String[option];
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("Enter the "+(i+1)+" element:");
		arr[i]=sc.nextLine();
	}
	System.out.println("Output after List conversion:");
	List lis=ArrayToList.convertToList(arr);
	System.out.println(lis);
	
}
}

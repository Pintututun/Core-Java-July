package multipleThreadConcurrently;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number for --");
	int a=sc.nextInt();
	
	Multithread1 m1=new Multithread1(a);
	Multithread2 m2=new Multithread2(a);
	Thread t1=new Thread(m1);
	Thread t2=new Thread(m2);
	t1.start();
	t2.start();
	
}
}

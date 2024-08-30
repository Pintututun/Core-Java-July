package thread_question4_july5;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter x value --");
	int a=sc.nextInt();
	System.out.print("Enter y value --");
	int b=sc.nextInt();
	Multithread3 m3=new Multithread3(a);
	Multithread4 m4=new Multithread4(b);
	
	Thread t1=new Thread(m3);
	Thread t2=new Thread(m4);
	t1.start();
	t2.start();
	
}
}

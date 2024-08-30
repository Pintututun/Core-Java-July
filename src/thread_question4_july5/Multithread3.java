package thread_question4_july5;

public class Multithread3 extends Thread{
   int x;

public Multithread3(int x) {
	super();
	this.x = x;
	
}
public void run()
{
	for(int i=1;i<x;i++)
	{
		System.out.println(i+" printed by "+Thread.currentThread().getName());
	}
}
}

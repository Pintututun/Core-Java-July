package thread_question4_july5;

public class Multithread4 extends Thread{
	int y;
	
	public Multithread4(int y) {
		super();
		this.y = y;
	}

	public void run()
	{
	for(int i=1;i<y;i++)
	{
		System.out.println(i+" printed by "+Thread.currentThread().getName());
	}
	}
}

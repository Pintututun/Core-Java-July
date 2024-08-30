package multipleThreadConcurrently;

public class Multithread2 extends Thread {

	int x2;

	public Multithread2(int x2) {
		super();
		this.x2 = x2;
	}
	public void run()
	{
		for(int i=1;i<=x2;i++)
		{
			System.out.println(i +" printed by "+Thread.currentThread().getName());
		}
	}

}

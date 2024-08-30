package multipleThreadConcurrently;

public class Multithread1 extends Thread {
	int x1;

	public Multithread1(int x1) {
		super();
		this.x1= x1;
	}
	public void run()
	{
		for(int i=1;i<=x1;i++)
		{
			System.out.println(i +" printed by "+Thread.currentThread().getName());
		}
	}
}

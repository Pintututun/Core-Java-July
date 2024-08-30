package classNotes_Multithreading;

public class AnonymousInnerClassWithThreadClassWithoutReference {
	public static void main(String[] args) 
	{
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Thread is running");
				System.out.println(Thread.currentThread().getName());
			}
			
		}.start();

	}
}

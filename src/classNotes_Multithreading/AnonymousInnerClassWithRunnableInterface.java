package classNotes_Multithreading;

public class AnonymousInnerClassWithRunnableInterface {
	public static void main(String[] args)
	{
		Runnable r1 = new Runnable()
		{
			@Override
			public void run() 
			{
				System.out.println("Thread is running");
				System.out.println(Thread.currentThread().getName());				
			}			
		};
        Thread t1 = new Thread(r1);
        t1.start();
	}
}

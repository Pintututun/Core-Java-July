package classNotes_Multithreading;

public class AnonymousInnerClassWithThreadClass {
	public static void main(String[] args)
	{
	   //Anonymous inner class
	   Thread t1 = new Thread()
	   {
		 @Override
		 public void run()
		 {
			 System.out.println("Thread is running");
			 System.out.println(Thread.currentThread().getName());
		 }
	   };
	   
	   t1.start();
	}
}

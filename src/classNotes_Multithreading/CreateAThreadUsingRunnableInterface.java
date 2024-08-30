package classNotes_Multithreading;

class Demo1 implements Runnable
{
	@Override
	public void run()	
	{		
		System.out.println("Child thread is running....");	
	}	
}
public class CreateAThreadUsingRunnableInterface {
	public static void main(String[] args)
	 {
		System.out.println("Main Thread has started...");
		
		Demo1 d1 = new Demo1(); 
		Thread t1 = new Thread(d1);
		t1.start();		
		System.out.println("Main Thread has ended");
	
	 }
}

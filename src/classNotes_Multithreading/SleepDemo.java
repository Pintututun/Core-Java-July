package classNotes_Multithreading;

class Sleep extends Thread
{
   @Override
   public void run() 
   {
	   for(int i=1; i<=10; i++)
	   {
		   System.out.println(i);
		   try
		   {
			  Thread.sleep(1000);
		    } 
		   catch (InterruptedException e) 
		   {
			e.printStackTrace();
		   } 
	   }
	   
   }
}
public class SleepDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Thread started...");
         Sleep s = new Sleep();
         s.start();
         
		System.out.println("Main Thread ended...");
	}
}

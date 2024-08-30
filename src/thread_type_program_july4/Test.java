package thread_type_program_july4;

 class A implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}

}
class B implements Runnable
{
	 public void run() 
	  {  
	   new A().run();   
	   
	   new Thread(new A(),"T8").start();   
//	   try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//	}
	    new Thread(new A(),"T2").run();  
	    
	    new Thread(new A(),"T3").start();  
	   }
}
public class Test
{  
  public static void main (String[] args) 
  {  
    new Thread(new B(),"T1").start();  
  }
}

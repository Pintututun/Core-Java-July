package classnotes_ThreadPriority;

public class ThreadYieldMethod {
	public static void main(String[] args) 
	{
		Runnable r1 = ()->
		{
			for(int i=1; i<=10; i++)
			{
				String name = Thread.currentThread().getName();

				System.out.println("i value is :"+i+" by thread :"+name);    
				
				 if(name.equals("Child1"))
					{
						Thread.yield();  //Give a chance to Child2 Thread
					 
					}
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.setName("Child1"); t2.setName("Child2");
        
		t1.start();  t2.start();
	}
}

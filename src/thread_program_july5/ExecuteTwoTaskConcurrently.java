package thread_program_july5;

public class ExecuteTwoTaskConcurrently {
public static void main(String[] args) {
	Runnable r1=new Runnable()
			{
		      public void run()
		      {
		    	  for(int i=1;i<=10;i++)
		    	  {
		    		  System.out.println(i+" Printed by "+Thread.currentThread().getName());
		    		  try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
		    	  }
		      }
			};
	Runnable r2=new Runnable()
		{
				public void run()
				{
					for(int j=11;j<=20;j++)
					{
						System.out.println(j+" Printed by "+Thread.currentThread().getName());
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
}
}

package thread_type_program_july4;

public class Test11 {
	public static void main(String[] args) 
	{
	 new Test11().go();
	}
	 public void go() 
	 {
	 Runnable r = new Runnable()
	 {
	 public void run() 
	 {
	 System.out.println("foo");
	 }};
	  Thread t = new Thread(r);
	  t.start();
	  t.run();
	 }
}

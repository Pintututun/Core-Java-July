package thread_type_program_july4;

public class Test5 {
	public static void main(String[] args) 
	{
		Runnable r = new Runnable() {
      public void run() {
       System.out.print("Cat");
         }
         };
 Thread t = new Thread(r) {
                  public void run() {
                           System.out.print("Dog");
                             }
                          };
 t.start();
		
	}
}

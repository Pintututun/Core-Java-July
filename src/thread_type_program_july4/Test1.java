package thread_type_program_july4;

public class Test1 extends Thread {
	static String name = "ravi";

	public static void main(String args[]) 
	{
	Test1 t = new Test1();
	t.Test(name);
	System.out.print(" " + name);
	}

	public void Test(String name) {
	start();
	System.out.print(" method");
	}

	public void run() {
	System.out.print(" run");
	}
}

package thread_type_program_july4;

public class Test4 extends Thread {

    public static void main(String[] args) throws Exception {
    Test4 t = new Test4();
    t.start();
    t.method();
    }

    public void run() {
    System.out.println("run");
    }

    public void method() {
	hello();
    System.out.println("method");
}

public void hello()
	{
	hello1();
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}

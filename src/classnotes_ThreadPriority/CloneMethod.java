package classnotes_ThreadPriority;

class Customertype implements Cloneable
{
	int id;
	String name;	
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + "]";
	}	
}
public class CloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException 
    {
		Customertype c1 = new Customertype();	
		c1.id = 111;
		c1.name = "Ravi";
		
		Customertype c2 = (Customertype) c1.clone(); //downcasting
		System.out.println(c1 +" : "+c2);
		
		
		c2.id = 333;
		c2.name = "shankar";
		System.out.println(c1 +" : "+c2);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode()); 
	}
}

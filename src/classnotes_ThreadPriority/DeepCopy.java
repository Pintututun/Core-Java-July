package classnotes_ThreadPriority;

class Employee
{
	int id;
	String name;
	
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}	
}
public class DeepCopy {
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.id = 111;
		e1.name = "Ravi";
		
		Employee e2 = new Employee();
		e2.id = e1.id;
		e2.name = e1.name;
		
		System.out.println(e1 +" : "+e2);
		
		e2.id = 222;
		e2.name = "shankar";
		System.out.println(e1 +" : "+e2);
	}
}

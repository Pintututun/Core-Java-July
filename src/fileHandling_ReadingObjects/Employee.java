package fileHandling_ReadingObjects;
import java.io.*;
import java.util.Date;

	public class Employee implements Serializable
	{
		private  int id;
		private  String name;
		private float sal;
		private Date doj;

		public Employee(int i, String n, float s, Date d)
		{
			id=i;
			name=n;
			sal=s;
			doj=d;
		}

		public void display()
		{
			System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
		}

		public static Employee getData() throws IOException  
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter emp id :");
			int id = Integer.parseInt(br.readLine());

			System.out.print("Enter Name :");
			String name=br.readLine();

			System.out.print("Enter Salary :");
			float sal=Float.parseFloat(br.readLine());

			Date d = new Date();	
			
			Employee e = new Employee(id,name,sal,d);
			return e;		
		}
	}


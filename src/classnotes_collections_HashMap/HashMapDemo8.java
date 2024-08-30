package classnotes_collections_HashMap;

import java.util.HashMap;
class Employee
{
	int eid;
	String ename;
	Employee(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

    @Override
	public boolean equals(Object obj)  //obj = e2
	{		
		Employee e2 = (Employee) obj;
        
		//Storing first Object (e1) contents to variables
		int eid1 = this.eid;       // here this is referring to e1 Object
		String name1 = this.ename;

        //Storing second Object (e2) contents to variables
		int eid2 = e2.eid;
		String name2 = e2.ename;

		if(eid1 == eid2 && name1.equals(name2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class HashMapDemo8 {
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101,"Aryan");
		Employee e2 = new Employee(102,"Pooja");
		Employee e3 = new Employee(101,"Aryan");
		Employee e4 = e2;

		HashMap<Employee,String> hm = new HashMap<>();
		hm.put(e1,"Ameerpet");
		hm.put(e2,"S.R Nagar");
		hm.put(e3,"Begumpet");
		hm.put(e4,"Panjagutta");

		hm.forEach((k,v)-> System.out.println(k+" : "+v));
	}
}

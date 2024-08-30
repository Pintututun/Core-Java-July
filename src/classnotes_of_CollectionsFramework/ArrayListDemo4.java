package classnotes_of_CollectionsFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void main(String [] args)  throws IOException
    {  
      ArrayList<String> al=new ArrayList<String>();  
      al.add("Nagpur");    
      al.add("Vijaywada");    
      al.add("Hyderabad");
		 al.add("Jamshedpur");       
     
				//Serialization  
				FileOutputStream fos=new FileOutputStream("D:\\City.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos); 
				
				
				 //Deserialization  
				FileInputStream fis=new FileInputStream("D:\\City.txt");				
				ObjectInputStream ois=new ObjectInputStream(fis); 

				try (fos; oos; fis; ois) 
             {  
				 oos.writeObject(al);  	//Serialization

	            ArrayList<String> list = (ArrayList<String>)ois.readObject();
				System.out.println(list);    
             }
			  catch(Exception e)  
			  {  
				  System.err.println(e);  
			  }
		  
  }  
}

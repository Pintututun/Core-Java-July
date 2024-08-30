package serializable_Deserializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BankDeserialization {
	public static void main(String[] args) throws IOException 
	   {
		   FileInputStream fin = new FileInputStream("D:\\Bank.txt");
		   ObjectInputStream ois = new ObjectInputStream(fin);
		   
		   try(fin; ois)
		   {
			   Bank b;
			   
			   while((b =(Bank)ois.readObject()) != null)
			   {
				   System.out.println(b);
			   }
			   
		   }
		   catch(Exception e)
		   {
			   System.err.println("End of file reached :"+e);
		   }
		
	   }
}

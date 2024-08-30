package classNotes_FileHandling;

import java.io.File;
import java.io.IOException;

public class FileO {
	public static void main(String[] args) 
	{
		try 
			{
				File f = new File("D:\\Batch19.txt");

                if(f.exists())
				{
					System.out.println("File is existing");
				}
				else
				{
					System.out.println("File is not existing");
				}

				if (f.createNewFile())
				   {
					 System.out.println("File created: " + f.getName());
                   }
				   else  
					{
                         System.out.println("File is already existing....");
                     }								  
              }
			  catch (IOException e)
             {
				System.err.println(e);
			} 
	}
}

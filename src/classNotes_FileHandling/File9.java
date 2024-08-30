package classNotes_FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class File9 {
	public static void main(String args[]) throws IOException
    {
         FileInputStream fin = new FileInputStream("D:\\Hyd.txt");
         BufferedInputStream bin = new BufferedInputStream(fin);
		   try(fin ; bin)
		   {
         int i;
         while((i = bin.read()) != -1)
         {
              System.out.print((char)i); 
         }
         }
		   catch(IOException e)
		  {
			   e.printStackTrace();
		  }
		  System.out.println();
    }
}

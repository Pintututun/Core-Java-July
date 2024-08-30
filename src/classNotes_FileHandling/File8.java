package classNotes_FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File8 {
	 public static void main(String args[]) throws IOException
     {
          FileOutputStream fout = new FileOutputStream("D:\\Hyd.txt");

          BufferedOutputStream bout = new BufferedOutputStream(fout);
         
		   try(fout ; bout)
		   {
          String s = "Hyderabad is a nice city. It is in India";
          byte b[] = s.getBytes();
          bout.write(b);
		   System.out.print("success..."); 
		  }
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }
     }
}

package classNotes_FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File6 {
	public static void main(String args[]) throws IOException
    {
			FileInputStream fin = new FileInputStream("D:\\Batch19.txt");

			FileOutputStream f1 = new FileOutputStream("D:\\a.txt");  
			FileOutputStream f2 = new FileOutputStream("D:\\b.txt");
			FileOutputStream f3 = new FileOutputStream("D:\\c.txt"); 			
			
			ByteArrayOutputStream bout = new 
			ByteArrayOutputStream(); 

			try(fin; f1; f2; f3; bout)
		    {
          int i;
			while((i = fin.read()) != -1)
          {
              bout.write((byte)i); //writing tha data to ByteArrayOutputStream
          }
          bout.writeTo(f1);
          bout.writeTo(f2);
		   bout.writeTo(f3);
		   
          bout.flush();  //clear the buffer for reusing of ByteArrayOutputStream
          System.out.println("Success");
			}
			catch(IOException e)
		    {
				e.printStackTrace();
		    }
    }
}

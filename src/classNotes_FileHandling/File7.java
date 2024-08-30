package classNotes_FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File7 {
	public static void main(String[] args) throws IOException
	{
		 FileInputStream fin = new FileInputStream("D:\\image\\Cape_may.jpg");

         FileOutputStream f1 = new FileOutputStream("D:\\a.jpg");
         FileOutputStream f2 = new FileOutputStream("D:\\b.jpg");
		 FileOutputStream f3 = new FileOutputStream("D:\\c.jpg");

         ByteArrayOutputStream bout = new ByteArrayOutputStream();

         try(fin; f1; f2; f3; bout)
		 {
         int i;
         while((i = fin.read()) != -1)
         {
               bout.write((byte)i);
         }
         bout.writeTo(f1);
         bout.writeTo(f2);
		 bout.writeTo(f3);
         System.out.println("success...");
		 bout.flush();
         }
		 catch(IOException e)
		{
			 e.printStackTrace();
		}
	}
}

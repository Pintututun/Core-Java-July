package classNotes_FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAndWrite {
	public static void main(String[] args) throws IOException
	{
		FileOutputStream f = new FileOutputStream("D:/Batch19.txt");
		try(f)
		{
			String str = "Hello India";
			 byte []b = str.getBytes();
			f.write(b);
			System.out.println("File Created ......");
		}
		catch(Exception e)
		{
          e.printStackTrace();
		}
	}
}

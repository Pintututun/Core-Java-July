package characterOrientedStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File14 {
	public static void main(String[] args) throws IOException
	{
       FileReader fr = new FileReader("D:\\c.jpg");
	   FileWriter  fw = new FileWriter("D:\\t.jpg");
	   
		try(fr;fw)
		{
		     int i;
		    while((i=fr.read())!= -1)
			{
				fw.write(i);
			}
		    System.out.println("Success.......");
		}
		catch(Exception e)
		{
		}
    }
}

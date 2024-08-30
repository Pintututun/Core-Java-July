package classNotes_FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class File5 {
	public static void main(String x[]) throws IOException
	{
		   FileInputStream f1 = new FileInputStream("D:\\ABC.txt");
           FileInputStream f2 = new FileInputStream("D:\\Batch19.txt");

           FileOutputStream fout = new FileOutputStream("D:\\Naresh.txt");

           SequenceInputStream s = new SequenceInputStream(f1,f2);

           int i;
		   try(f1; f2; fout; s)
		   {
           while(true)
           {
			   i = s.read();
			   if(i==-1)
				    break;
               System.out.print((char)i);
               fout.write((byte)i);
           }
		   }
		   catch(IOException e)
		   {
			   e.printStackTrace();
		   }
		   System.out.println();
		   System.out.println("File Created Successfully");
     }
}

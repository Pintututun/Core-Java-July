package classNotes_FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class File4 {
	public static void main(String args[]) throws IOException
    {
        FileInputStream f1 = new FileInputStream("D:\\ABC.txt");
        FileInputStream f2 = new FileInputStream("D:\\Batch19.txt");

        SequenceInputStream s = new SequenceInputStream(f1,f2);

		 try(f1; f2; s)
		 {
        int i;
        while(true)
		 {
			  i = s.read();
			   if(i==-1)
				  break;
			  System.out.print((char)i);		 
		 }     
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
    }
}

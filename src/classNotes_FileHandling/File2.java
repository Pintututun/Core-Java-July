package classNotes_FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class File2 {
	 public static void main(String s[]) 
     {         
		 try( FileInputStream fin = new FileInputStream("D:\\Batch19.txt"))
		 {
          while(true)
           {
             int  i = fin.read();
              if(i == -1)
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

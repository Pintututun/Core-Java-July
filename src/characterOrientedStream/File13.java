package characterOrientedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File13 {
	public static void main(String args[]) throws IOException
    {
         FileReader fr = new FileReader(args[0]); //Command Line Arg
		 BufferedReader br = new BufferedReader(fr);
		 try(fr ; br)
		 {
         while(true)
         {
              int i = br.read();
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

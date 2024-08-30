package characterOrientedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File11 {
	public static void main(String args[]) throws IOException
    {
         FileWriter fw = new FileWriter("D:\\HelloIndia.txt");
		 BufferedWriter bw = new  BufferedWriter(fw);

		 try(fw; bw)
		 {
         bw.write("Hello India, It is a great country.");
         System.out.print("Success....");
		 }
		 catch(IOException e)
		  {
			  e.printStackTrace();
		  }
    }
}

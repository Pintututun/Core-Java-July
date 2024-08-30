package characterOrientedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File12 {
	 public static void main(String args[]) throws IOException
	    {
			FileWriter fw = new FileWriter("D:\\Data.txt");
			BufferedWriter bw = new  BufferedWriter(fw);

	        try(fw;bw)
			{        
			 char c[ ] =  {'H','E','L','L','O', ' ',' ','W','O','R','L','D'};
			 
	         bw.write(c);
	         System.out.println("Success....");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	    }
}

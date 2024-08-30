package fileHandling_july11;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class FilesAndIO12 {
	public static void nit() throws IOException
	{
		ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();
		BufferedOutputStream bout = new BufferedOutputStream(arrayOut);
		String str = "Welcome to NareshIT";
		byte b[] = str.getBytes();
		bout.write(b);
		bout.flush();
		
		for(byte bite : arrayOut.toByteArray()) 
		{
			char ch = (char)bite;
			System.out.print(ch);
		}
	}
	public static void main(String[] args) throws IOException {
		
		nit();
	}
}

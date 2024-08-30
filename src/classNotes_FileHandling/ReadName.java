package classNotes_FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadName {
	public static void main(String[] args) throws IOException 
	{
      //DataInputStream dis = new DataInputStream(System.in);

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.print("Enter your Name :");
	  String name = br.readLine();
	  System.out.println("Your name is :"+name);
	}
}

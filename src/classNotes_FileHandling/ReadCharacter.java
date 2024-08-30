package classNotes_FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharacter {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your Gender :");

		 char ch = (char) br.read();
		 System.out.println("Your Gender is :"+ch);

		
	}
}

package classNotes_FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpDataDemo {
	public static void main(String [] args) throws IOException
	{
		 BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));

		System.out.print("Enter id: ");
		int id = Integer.parseInt(br.readLine());  

		System.out.print("Enter sex (M/F): ");	
		 char gen = br.readLine().charAt(0); //Male \n
		           
		  
		System.out.print("Enter name: ");
		String name = br.readLine();

		System.out.println("Id = "+id);
		System.out.println("Sex = "+gen);
		System.out.println("Name = "+name);
		}
}

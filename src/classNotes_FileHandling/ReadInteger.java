package classNotes_FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInteger {
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your Age :");
			String ag = br.readLine();

            //Converting String to integer
			int age = Integer.parseInt(ag);
            System.out.println("Your Age is :"+age);
            if(age>18)
			{
				System.out.println("Go for a movie");
			}
			else
			{
				System.out.println("You are minor ..try after some year");
			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
			
	}
}

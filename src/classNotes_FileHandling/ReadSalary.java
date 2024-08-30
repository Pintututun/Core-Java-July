package classNotes_FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadSalary {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter your Salary :");
		String sal = br.readLine();

        //Converting String to float value
		float salary = Float.parseFloat(sal);

		System.out.println("Your salary is :"+salary);

	}
}

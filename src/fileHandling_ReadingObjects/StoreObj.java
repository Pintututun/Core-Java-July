package fileHandling_ReadingObjects;
import java.io.*;
import java.util.*;
public class StoreObj {
	
		public static void main(String[] args) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			FileOutputStream fos = new FileOutputStream("D:\\ObjectEmployee.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			try(br ; fos; oos)
			{
				System.out.print("How many objects you want to write?");
				int n =Integer.parseInt(br.readLine());     //n = 3 
				
				for(int i=0; i<n; i++)                           
				{
					Employee e1 = Employee.getData();
					oos.writeObject(e1);
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}
}

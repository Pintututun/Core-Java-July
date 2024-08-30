package fileHandling_ReadingObjects;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetObj {
	public static void main(String[] args)  throws IOException, InterruptedException
	{
		
		FileInputStream fis = new FileInputStream("D:\\ObjectEmployee.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		try(fis; ois)
		{
			Employee e;
			while((e = (Employee) ois.readObject()) !=null)
			{
				e.display();
			}
		}
		catch (Exception ee) 
		{
			System.out.println("End of file reached :"+ee);
		}
		
	}
}

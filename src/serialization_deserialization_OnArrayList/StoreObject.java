package serialization_deserialization_OnArrayList;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreObject {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Students information you want to give:");
	int option=sc.nextInt();
	FileOutputStream fos;
		fos = new FileOutputStream("Student.txt");
	ObjectOutputStream oos;
		oos = new ObjectOutputStream(fos);
     ArrayList<Student> stud=new ArrayList<Student>();
	try(fos;oos)
	{
	for(int i=1;i<=option;i++)
	{
		Student st=Student.getStudentObject();
		stud.add(st);
	}
	oos.writeObject(stud);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	System.out.println("File Successfully loaded");
	
}
}

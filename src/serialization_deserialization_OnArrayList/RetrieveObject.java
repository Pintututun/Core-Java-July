package serialization_deserialization_OnArrayList;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetrieveObject {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("Student.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	System.out.println("Retrieved Information:");
	try(fis;ois)
	{
		ArrayList<Student> stud;
		stud=(ArrayList<Student>)ois.readObject();
		stud.forEach(x->System.out.println(x));	
	}
	catch(Exception e)
	{
	}
	System.out.println("File Successfully retrieved");

}
}


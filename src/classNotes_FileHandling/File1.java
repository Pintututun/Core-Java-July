package classNotes_FileHandling;

import java.io.FileOutputStream;

public class File1 {
	public static void main(String args[]) 
    {
       try(FileOutputStream fout = new FileOutputStream("D:\\ABC.txt"))
        {
        String s = "India is a Great country";
		 byte b[] = s.getBytes();
		 fout.write(b);

		 System.out.println("Success....");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
    }
}

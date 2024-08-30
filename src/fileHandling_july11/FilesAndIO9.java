package fileHandling_july11;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO9 {
public static void main(String[] args) throws IOException {
	 FileOutputStream fileOut = new FileOutputStream("D:\\hai.txt");
     
     BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);

     for(int i = 70; i < 80; i++)
     {
         bufferOut.write(i);
     }
     bufferOut.flush();
     bufferOut.close();
     fileOut.close();
     System.out.println("Completed");
 }
}


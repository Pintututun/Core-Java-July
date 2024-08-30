package fileHandling_july11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO7 {
	public static void main(String[] args) {
		try {
			String str = "Welcome to NareshIT";
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\July\\Tutun1.txt");
			byte[] by = str.getBytes();
			fileOut.write(by);
			fileOut.close();
			FileInputStream fileIn = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\July\\Tutun1.txt");
			int i = fileIn.read();
			System.out.println((char)i);
			fileIn.close();
		}catch (FileNotFoundException e) {
			System.out.println("1"+e.getMessage());
	}catch (IOException e) {
			System.out.println("2"+e.getMessage());
		}
	}
}

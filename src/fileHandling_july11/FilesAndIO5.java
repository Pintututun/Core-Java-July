package fileHandling_july11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO5 {
	public static void main(String[] args) {
		String str = "Welcome to NareshIT";
		try {
			FileOutputStream file = new FileOutputStream("Pintu1.txt");
			byte[] by = str.getBytes();
			file.write(by);
			file.close();
			System.out.println("Completed");
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
}
}

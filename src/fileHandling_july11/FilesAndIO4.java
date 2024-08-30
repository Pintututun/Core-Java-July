package fileHandling_july11;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO4 {
	public static void main(String[] args) throws IOException  {
		String str = "Welcome to NareshIT";
		FileOutputStream file = new FileOutputStream("/google.txt");
		byte[] by = str.getBytes();
		file.write(by);
		file.close();
		System.out.println("Completed");
	}
}

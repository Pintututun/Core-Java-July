package fileHandling_july11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FilesAndIO3 {
	public static void main(String[] args) throws IOException {
		String str = "Welcome to NareshIT";
		FileOutputStream file = new FileOutputStream("Pintu.txt");
		byte[] by = str.getBytes();
		file.write(by);
		file.close();
		System.out.println(Arrays.toString(by));
		System.out.println("Completed");
	}
}
// FileNotFoundException only for FileOutputStream not for write() and close()
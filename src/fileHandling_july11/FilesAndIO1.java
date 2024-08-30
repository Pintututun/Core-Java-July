package fileHandling_july11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilesAndIO1 {
	public static void main(String[] args) throws IOException {
		OutputStream file = new FileOutputStream("Pintu1.txt");
		System.out.println(file.getClass());
	}
}

package fileHandling_july11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilesAndIO2 {
	public static void main(String[] args) throws IOException {
		InputStream file = new FileInputStream("Pintu.txt");
		System.out.println(file.getClass());
	}
}

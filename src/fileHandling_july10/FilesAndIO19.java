package fileHandling_july10;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO19 {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("/hai.txt");
		System.out.println(file.getFD());
	}
}

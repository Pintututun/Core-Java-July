package fileHandling_july10;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO20 {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\July\\Pintu2.txt");
		System.out.println(file.getFD());
	}
}

package fileHandling_july11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilesAndIO10 {
	public static void main(String[] args) throws IOException {
		InputStream fin = new FileInputStream("D:\\hai.txt"); 
		System.out.println(fin.available());
	}
}

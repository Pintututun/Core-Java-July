package fileHandling_july10;

import java.io.File;
import java.io.IOException;

public class FilesAndIO8 {
	public static void main(String[] args) throws IOException {
		File file = new File("Pintu2.txt");
		
		boolean result = file.createNewFile();
		
		
		System.out.println(result);
		
	}
}

package fileHandling_july10;

import java.io.File;

public class FilesAndIO11 {
	public static void main(String[] args)
	{
		File file = new File("/hai.txt");
		boolean result = file.exists();
		System.out.println(result);	
	}
}

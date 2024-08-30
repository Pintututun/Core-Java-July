package fileHandling_july10;

import java.io.File;

public class FilesAndIO2 {
	public static void main(String[] args)
	{
		File file = new File("\\");
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
	}
}

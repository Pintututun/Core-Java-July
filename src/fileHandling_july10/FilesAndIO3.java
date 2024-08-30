package fileHandling_july10;

import java.io.File;

public class FilesAndIO3 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\July\\src\\book_myshow_application\\TicketDispenser.java");
		System.out.println(file.isFile());
	}
}

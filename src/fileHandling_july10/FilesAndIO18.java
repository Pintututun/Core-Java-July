package fileHandling_july10;

import java.io.IOException;
import java.io.OutputStream;

public class FilesAndIO18 {
public static void main(String[] args) throws IOException {
		
		OutputStream out = new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				System.out.println(b);
			}
		};
		out.write('a');
	}
}

package fileHandling_july11;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilesAndIO13 {
	public static void nit() {
		try {
			OutputStream file = new FileOutputStream("D:\\hai.txt");
			DataOutputStream data = new DataOutputStream(file);
			data.writeBytes("NareshIT");
			data.flush();
			data.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void nit1() {
		try {
			OutputStream file = new FileOutputStream("D:\\hai.txt");
			DataOutputStream data = new DataOutputStream(file);
			data.writeChars("Welcome to NareshIT");
			data.flush();
			data.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void nit2() {
		try {
			OutputStream file = new FileOutputStream("D:\\hai.txt");
			DataOutputStream data = new DataOutputStream(file);
			data.writeUTF(" Hai NareshIT ");
			data.writeBoolean(true);
			data.flush();
			data.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		nit();
		nit1();
		nit2();
	}
}

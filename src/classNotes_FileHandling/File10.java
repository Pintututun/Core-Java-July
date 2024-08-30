package classNotes_FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File10 {
	 public static void main(String args[]) throws IOException
     {
         FileOutputStream fout = new FileOutputStream("D:\\Primitive.txt");

         DataOutputStream dout = new DataOutputStream(fout);
		  try(fout ; dout)
		  {
         dout.writeBoolean(true);
         dout.writeChar('A');
         dout.writeByte(Byte.MAX_VALUE);
         dout.writeShort(Short.MAX_VALUE);
         dout.writeInt(Integer.MAX_VALUE); 
         dout.writeLong(Long.MAX_VALUE);
         dout.writeFloat(Float.MAX_VALUE); 
         dout.writeDouble(Math.PI);//PI is a final static variable
		  dout.writeBytes("Hello India...");
         dout.flush();//For reuse purpose
         }
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }
		  System.out.println("Reading the Primitive data from the files!!!");
         
		  FileInputStream fin = new FileInputStream("D:\\Primitive.txt");
         DataInputStream din = new DataInputStream(fin);
		  try(fin ; din)
		  {
         boolean f = din.readBoolean();
         char c = din.readChar();
         byte b = din.readByte();
         short s = din.readShort();
         int i = din.readInt();
         long l = din.readLong();
         float ft = din.readFloat();
         double d = din.readDouble();
		   String x=  din.readLine();//for reading String (deprecated)

         System.out.println(f +"\n"+c+"\n"+b+"\n"+s+"\n"+i+"\n"+l+"\n"+ft+"\n"+d+"\n"+x);
		  }
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }
     }
}

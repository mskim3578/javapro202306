package ch16_IO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class DataInputStreamEx1 {
	public static void main(String args[]) {
		String fileName = "src/ch16_IO/sample.dat";
		try {
			FileInputStream fis = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(fis);
			File f = new File(fileName);
			System.out.println("file length:"+f.length());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			
			//10, 20.0f, true
			
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();		
  		}
	} // main
}
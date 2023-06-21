package ch16_IO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class DataInputStreamEx2 {
	
	public static void main(String args[]) {
		String fileName = "src/ch16_IO/score.dat";
		FileInputStream fis=null;
		DataInputStream dis=null;
		int sum=0;
		int index=0;
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			
			while(true) {
				int score = dis.readInt();
				sum+=score;
				index++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} finally {
			System.out.println("합계:"+sum);
			System.out.println("평균:"+(double)sum/index);
			
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	} // main
}
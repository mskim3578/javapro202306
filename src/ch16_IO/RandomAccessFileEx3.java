package ch16_IO;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccessFileEx3 {
	public static void main(String args[]) {
		int sumkor = 0;
		int sumeng = 0;
		int summath = 0;
		try {
			RandomAccessFile raf = 
					new RandomAccessFile("src/ch16_IO/score2.dat", "r");
			int i=4;
			while(true) {
				raf.seek(i);
				sumkor += raf.readInt();
				sumeng += raf.readInt();
				summath += raf.readInt();
				i+=16;
			}
		} catch (EOFException e) {
			System.out.println("국어 sum : " + sumkor);
			System.out.println("영어 sum : " + sumeng);
			System.out.println("수학 sum : " + summath);
		} catch (IOException e) {
			e.printStackTrace();		
		}	}}


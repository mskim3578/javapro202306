package ch16_IO;
/*
 * FileOutputStream 예제
 *   : 파일에 데이터 출력
 *   void write(int data) : data 중 1바이트만 파일로 출력
 *   void write(byte[] buf) : buf의 내용을 파일로 출력 
 *   void write(byte[] buf,int start, int len) : buf의 start 인덱스 부터 
 *        len바이트 만큼 내용을 파일로 출력 
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		String fileName = "src/ch16_IO/out01.txt";
		FileOutputStream fos = new FileOutputStream(fileName);
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		//getBytes() : 문자열을 byte[]로 리턴.
		byte[] buf = "\n반갑습니다. FileOutputStream 예제 입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf, 1, 6);
		fos.flush();
	}
}
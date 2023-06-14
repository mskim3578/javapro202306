package ch12_API;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Scanner 를 이용하여 File 정보 읽기
 */
public class ScannerEx4 {
	public static void main(String[] args)  {
		//File : 파일의 정보를 저장하는 클래스
		Scanner scan=null;
		try {
			scan = new Scanner(new File("src/ch12_API/score.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int cnt = 0;		int totalSum = 0;
		while(scan.hasNextLine()) {//다음 줄이 존재?
			String line = scan.nextLine();//line = "홍길동,4.5,3.8,4.2"
			Scanner scan2 = new Scanner(line).useDelimiter(",");
			double sum = 0;
			int i = 0;
			String name = scan2.next();//name="홍길동"
			System.out.print(name.trim() + ":");
			while(scan2.hasNextDouble()) {
				double score = scan2.nextDouble();//4.5
				sum += score;
				System.out.print(score + ",");
				i++;			}
			System.out.println("sum="+sum+",avg=" + 
			((int)(sum/i * 100))/100.0);
			
			totalSum += sum;
			cnt++;
		}
		System.out.println("인원수:" + cnt + "   합계:"+totalSum);			}}
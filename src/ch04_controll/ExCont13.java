package ch04_controll;

import java.util.Scanner;

/*
 * 입력받은 숫자가 좌우대칭수인지 판단하기
 * 숫자를 입력하세요
 * 1221  = 
 * 좌우대칭수
 * 123
 * 좌우대칭수아님
 */



public class ExCont13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		System.out.println(num);
		int temp = num;
		
		int result =0;
		while(temp!=0) {
			result *=10;
			result += temp%10;
			System.out.println(result+":"+temp/10+":"+temp%10);
			temp /=10;
			
		}
		if(num == result) {
			System.out.println("좌우대칭수 ");
		} else {
			System.out.println("좌우대칭수아님");
		}
		

	}

}

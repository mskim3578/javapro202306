package ch04_controll;

import java.util.Scanner;

public class ExCont02 {
	/*
	 * 키보드에서 한개의 문자를 입력받아서 대문자, 소문자, 숫자, 기타문자인 출력하기
*/
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("대문자");
		}else if(ch>='a' && ch<='z') {
			System.out.println("소문자");
		}else if(ch>='0' && ch<='9') {
			System.out.println("숫자");
		}else {
			System.out.println("기타문자");
		}

	}

}

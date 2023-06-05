package ch03_op;

import java.util.Scanner;

/*
 * 한개의 문자를 입력받아서 소문자인 경우는 대문자로 변경하여 출력하기 
 * 소문자가 아닌 경우는  "소문자아님" 출력하기

*/
public class ExOp05 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); //문자열로 입력받기.  "A"
		char ch = str.charAt(0); //문자열 중 첫번째 문자  'A'
		System.out.println(ch +":"+(int)ch);
		
		
		System.out.println((ch>=97 && ch <=122)
				?(char)(ch-32):"소문자아님");
		//===============
		String temp = "";
		for(int i = 0 ; i < str.length() ; i++) {
		ch=	str.charAt(i);
		temp += ((ch>=97 && ch <=122)
				?(char)(ch-32):ch);
		
		}
		System.out.println(temp);
		//===========================
		System.out.println((ch>='a' && ch <='z')
				?(char)(ch-32):"소문자아님");
		//a:97, z:122

	}

}

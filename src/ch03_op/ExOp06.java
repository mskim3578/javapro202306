package ch03_op;

import java.util.Scanner;

/*
 * 사과를 사과 상자에 담기로 한다. 1개의 상자에 10개의 사과를 담을 수 있다.
 * 필요한 사과 상자의 갯수를 출력하기
 * [결과]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수 : 3
 *
 * 사과의 갯수를 입력하세요
 * 30
 * 필요한 상자의 갯수 : 3
 */
public class ExOp06 {

	public static void main(String[] args) {
		System.out.println("사과의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((num%10==0)? (num/10): (num/10 + 1));
	}

}

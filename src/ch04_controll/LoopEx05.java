package ch04_controll;

import java.util.Scanner;

/*
 * 무한 반복(루프) : 절대 종료되지 않는 프로그램. 
 * 화면에서 숫자를 입력받기. 99999 숫자 입력되면 입력을 종료함.
 * 입력 종료시 숫자의 총합(sum) 과 평균(cnt) 을 구하기
 */


public class LoopEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요(종료:99999)");
		Scanner scan = new Scanner(System.in);
		int sum=0, cnt=0;
		while(true) {
			int num = scan.nextInt();
			if (num==99999) break;
			sum+=num;
			cnt++;
			//System.out.println(num);
		}
		System.out.println("총합 :" + sum);
		System.out.println("평균 :" + (double)sum/cnt);
		
	}

}

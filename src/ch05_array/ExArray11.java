package ch05_array;

import java.util.Scanner;

public class ExArray11 {
	// 네온숫자 가로로 출력하기
	public static void main(String[] args) {
		String neonNumber[][] = {
				{ "*****", "*   *", "*   *", "*   *", "*****" },
				{ " **  ", "  *  ", "  *  ", "  *  ", " *** " }, 
				{ "*****", "    *", "*****", "*    ", "*****" },
				{ "*****", "    *", "*****", "    *", "*****" }, 
				{ "  ** ", " * * ", "*  * ", "*****", "   * " },
				{ "*****", "*    ", "*****", "    *", "*****" },
				{ "*****", "*    ", "*****", "*   *", "*****" },
				{ "*****", "*   *", "*   *", "    *", "    *" }, 
				{ "*****", "*   *", "*****", "*   *", "*****" },
				{ "*****", "*   *", "*****", "    *", "    *" } };

		String temp = " ";
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1 에서 9 까지의 숫자를 입력하세요." + " 끝내려면 -1  입력하세요.");
			temp = scan.next();

			if (temp.equals("-1")) {
				System.out.println("end");
				break;
			}

			System.out.println("입력값 : " + temp);

			for (int i = 0; i < 5; i++) // 각 네온숫자 배열은 5칸으로 구성
			{
				for (int j = 0; j < temp.length(); j++) // 본격 네온사인 출력문
				{
					char ch = temp.charAt(j);
					System.out.print(neonNumber[ch - 48][i] + "\t");

				}
				System.out.println();
			}
		}
	}
}
package ch05_array;

import java.util.Iterator;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 배열 크기를 입력하세요");
		int num = scan.nextInt();
		int[][] matrix = new int[num][num];
		int start = 0;
		int end = num - 1;
		int count=0;
		boolean chk=true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (start <= j && end >= j)
					matrix[i][j] = ++count;
			}
			if (start==end) chk=false;
			System.out.println(" " + start + "," + end);
			if (chk) { start++;	end--;}
			else { start--;	end++;}
			System.out.println();
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j]>0) 
					System.out.print(matrix[i][j]+ (matrix[i][j]>9?" ":"  "));
				else System.out.print("   ");
			}
			System.out.println();
		}
	}

}

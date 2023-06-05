package ch05_array;

import java.util.Scanner;

public class ExArray01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
	    int max = Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			sum +=score[i];
			if (max < score[i])  max=score[i];
			if (min > score[i])  min=score[i];
		}
		
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/score.length);
		System.out.println("최대점수:" + max);
		System.out.println("최소점수:" + min);

	}

}

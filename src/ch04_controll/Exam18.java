package ch04_controll;

import java.util.Scanner;

public class Exam18 {
	/*
	 * 	
	8
	       *       
	      ***      
	     *****     
	    *******    
	   *********   
	  ***********  
	 ************* 
	***************
	 ************* 
	  ***********  
	   *********   
	    *******    
	     *****     
	      ***      
	       *       


	*/	

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int num = scan.nextInt();
		int start = num;
		int end = num;

		for (int i = 1; i <= (2 * num - 1); i++) {

			for (int j = 1; j <= (2 * num - 1); j++) {

				if (start <= j && end >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			
			if (i<num) {			start--;			end++;}
			else {start++; end --;}

			System.out.println();
		}

	}

}
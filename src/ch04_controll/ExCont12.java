package ch04_controll;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
8
       *       
      ***      
     *****     
    *******    
   *********   
  ***********  
 ************* 
***************
 
 */
public class ExCont12 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		
		for (int i = 1; i <=len ; i++) {

			for (int j = 1; j <=(len*2 -1); j++) {
				if (j > len-i && j < len+i)
				System.out.print("*");
				else
				System.out.print(" ");
				

			}
			System.out.println(i);
		}

	}

}

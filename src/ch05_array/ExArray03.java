package ch05_array;
/*
 * 1 ~ 10 사이의 임의의 수를 만들어서 
 * 각수마나 나온 횟수 만큼 '*'를 프린트 하세요 
3 9 2 1 5 1 8 9 5 6 
1:**
2:*
3:*
4:
5:**
6:*
7:
8:*
9:**
10:
 * 
 */

public class ExArray03 {
	public static void main(String[] args) {
		int[] arr= new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + ":");
			for (int j = 0; j < arr.length; j++) {
				if (i==arr[j]) System.out.print("*");
			}
			System.out.println();
		}
	}
}



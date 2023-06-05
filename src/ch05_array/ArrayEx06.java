package ch05_array;

/*
 *  2차원 배열 예제
 *  2차원 배열은 1차원 배열의 참조변수의 배열로 정의 된다.
 */


public class ArrayEx06 {

	public static void main(String[] args) {
		int[][] arr = new int[3][2]; // [row][column]  100, 200,300,400
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
	System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}

	
	
	System.out.println("객체 변경");
	int[] arr1 = { 1, 2, 3, 4, 5 }; //  500
	// arr[1] 의 자료형 int[] 자료형
	// arr1 의 자료형 int[] 자료형
	arr[1][0] = 122;
	arr1[3] = 5000;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
		}
		System.out.println();
	}

	for (int i = 0; i < arr1.length; i++) {
		System.out.print(arr1[i] + ",");
	}
	System.out.println();
	
	
	}
}

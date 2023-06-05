package ch05_array;

public class ExArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		for(int i : arr) {
			System.out.println(i);
		}
		
		for(int a : arr) {
			System.out.print(a + ":");
			for(int i=0;i<a;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

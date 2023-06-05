package ch05_array;

/*
 * 1부터 100까지 임의의 수 10개를 
 * 배열에 저장하고, 정렬하여 출력하기
 * 단 Arrays.sort() 메서드는 사용하지 않기. 
 */
public class ExArray05 {
	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100 + 1);
			System.out.print(num[i]+" ");		}
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			boolean change = false;
			for (int j = 0; j < num.length-1-i; j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					change=true;
				}
			}
			if (!change) break;
			
		}
		
		for (int b : num) {			System.out.print(b + ",");
		}
		System.out.println();		
	}
}

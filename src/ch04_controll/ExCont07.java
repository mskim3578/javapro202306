package ch04_controll;

//(1) + (1+2) + (1+2+3)+... (1+2+3+...10)=220 출력하기
public class ExCont07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ ((i==j)?"":"+"));
				sum +=j;
			}
			System.out.print(")"+ ((i==10)?"=":"+"));
		}
		System.out.println(sum);
	}

}

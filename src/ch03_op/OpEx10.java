package ch03_op;

public class OpEx10 {

	public static void main(String[] args) {
		long a = 1000000 * 1000000;  //int overflow
		long b = 1000000 * 1000000L; //long ok
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}

}

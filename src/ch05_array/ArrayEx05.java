package ch05_array;

public class ArrayEx05 {

	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length == 0) {
			System.out.println("커맨드라인에 파라미터를 입력하세요");
			System.out.println("java ch05_array.ArrayEx05 홍길동 김삿갓");
			return;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"]="+args[i]);
		}

	}

}

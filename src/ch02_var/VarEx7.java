package ch02_var;

public class VarEx7 {

	public static void main(String[] args) {
        byte b1 =   (byte) 255;
		int i1 = b1; //-1 
		System.out.println("b1:"+b1+", i1="+i1);
		char c1 = 'A';
		short s1 =  (short) c1;
		char c2 =  (char) b1;  //-1
		System.out.println("b1="+b1);  //-1
		System.out.println("c2="+c2);  //대입문자 없음
		/*
		 *  1111111111111111  char : 2byte
		 * - 111111111111111
		 * =================
		 *                 0 
		 *                 보수 + 1 값은 1 이고 sign bit 1이여서 -1이 된다
		 */
		
		System.out.println("s1="+s1);  // A의 문자의 int 값
		int charint = c2; // 1111111111111111 
		System.out.println("charint="+charint+" , c2="+c2);
		System.out.println("65535:"+Integer.toBinaryString(c2));
		
		
		
		
	}

}

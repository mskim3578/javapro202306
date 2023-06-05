package ch02_var;

public class VarEx2 {
	/* 
	 * 형변환 예제      
	 *   큰자료형<=작은 자료형 : 자동형변환
	 *   작은자료형 <= 큰자료형 : 명시적 형변환
	 *   byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
	 *  	       char(2)
	 *          
	 *  A=B : 같다 의 의미가 아니고, 대입의 의미임.
	 *        B의 값을 A에 입력함.
	 *  left value(A) : 대입연산자의 왼쪽의 값. 반드시 변수여야함.
	 *  right value(B) : 대입연산자의 오른쪽의 값, 변수, 리터널, 수식 가능             
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		char aa = 'a';      
		// 1. 참조형과 기본형은 형변환 불가
		String s = "a"; // "" : 문자열,String, ' ':문자, char
		// s = 'a'; //참조형인 String 기본형인 char 형이 변환 불가.
		// 2. 기본형 사이에 boolean을 제외한 7개는 서로 형변환이 가능함
		byte b1 =   (byte) 255;
		
		int i1 = b1;  
		byte b2 = (byte) i1;
		System.out.println("b1:"+b1+", i1="+i1);
		
		byte b3 = 100;
		System.out.println("b3=" + b3);
		long ll = 10;
		
		float f1 = ll;
		long l2 =  (long) f1;
		char c1 = 'A';
		short s1 =  (short) c1;
		char c2 =  (char) b1;  //-1
		System.out.println("c2="+c2);
		System.out.println("s1="+s1);
		int charint = c2;
		System.out.println("charint="+charint);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

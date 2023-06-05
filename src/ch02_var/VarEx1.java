package ch02_var;

public class VarEx1 {
	String aaa;
	public static void main(String[] args) {
		//변수의 선언 및 초기화
				byte b1 = -22;
				byte b2; //변수의 선언. b2 저장공간 메모리 1바이트(8bit) 할당.
				//바이트로 저장할 수 있는 값의 범위. -128 ~ 127 저장가능
				b2= -128; //변수의 초기화
				b1=127;
				short s1 = -220;
				int i1 = 100;
				long l1 = 1000;  // auto casting
				
				//변수값 내용을 화면에 출력하기
				//System.out.println : 화면에 값을 출력.
				System.out.println("b1=" + b1); //b1=-22
				System.out.println("s1="+s1);
				System.out.println("i1="+i1);
				System.out.println("l1="+l1);
				
				float f1 = 1.0f;
				double d1 = 1.0; 
				double d12 = 1d;
				
				
				System.out.println("f1=" + f1);
				System.out.println("d1=" + d1);
				System.out.println("d12=" + d12);
				/*
				 * 실수형 리터널의 기본자료형은 double 임
				 * float 리터널로 표시하기 위해서는 접미사를 붙여야 한다.
				 *  F,f : float 리터널
				 *  D,d : double 리터널
				 *  L,l : long 리터널
				 */
	
	
	
	
	
	
	
	
	
	
	}
	}
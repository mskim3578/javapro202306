package ch11_exception;
/*
 * 다중 catch 구문 예제
 * top -> down으로 처리되며 
 * 서로 상관없는 Excepion은 상관없지만 
 * 상속 관계의 Exception은 조상이  아래에 있어야함 
 */
public class ExceptionEx22 {
	public static void main(String[] args) {
		
		try {
			//ArrayIndexOutOfBoundsException 예외 발생
			//System.out.println(args[0]); // 1) 입력않함
			//NumberFormatException 예외 발생
			System.out.println(Integer.parseInt("1"));
			//System.out.println(10/Integer.parseInt("0"));
			String str = null;
			System.out.println(str.charAt(0));
			//NullPointerException
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("관리자에 문의 하세요");
		
		}
		
		
		
		
	  }
	}
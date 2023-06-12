package ch11_exception;
/*
 * finally 구문 : 정상 실행, 예외실행 모두 실행됨
 *               try, catch 구문에서 return문장을 만나도 finally는 실행됨.
 *               try 구문과 같이 사용됨.
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
		   System.out.println(1);
		   System.out.println(2);
		   System.out.println(3/1);
		 //  return; //메서드 종료
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println("finally:"+5);
			//return이 먼저 실행되어도 finally 실행된다
		}
		 System.out.println(6);
	}
	
}
package ch06_obj1;
/*
 * 메서드 구성
 * [접근제어자] 리턴타입 메서드이름(매개변수 목록) => 선언부
 * {   문장들      }                   => 구현부
 * 리턴타입 : 메서드 종료 후 전달되는 값의 자료형.
 *         void인 경우는 리턴값이 없다.
 * 매개변수 : 메서드 호출시 전달되는 초기화 값.
 *         매개변수가 없는 경우 () 표현함.
 * return : return이 실행되면 메서드가 종료됨.
 *         리턴타입이 void가 아닌 경우는 반드시 return 리턴값; 구현해야 함.
 *         void 인 경우는 return 생략 가능함. 메서드의 마지막 '}' 메서드가 종료됨.               
 */
public class MethodEx1 {
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int i = (int) m1.add1(10, 20);		
		long l = m1.add2(10, 20);
		double d = Math1.add3(10, 20);
		System.out.println(m1.add1(10, 20));
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
	}}
class Math1 {	
// add1, add2, add3 
	int add1(int num1, int num2) {
    	return num1+num2;
    }
    
    long add2(int num1, int num2) {
    	return num1+num2;
    }
    
    static double add3(int num1, int num2) {
    	return num1+num2;
    }
}
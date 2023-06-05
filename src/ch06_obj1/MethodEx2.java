package ch06_obj1;
/*
 * 멤버 메서드의 종류
 *   클래스(static)  메서드 :클래스정보 로드될때 메서드의 호출이 가능함. 클래스명.메서드명() 호출할수 있다.	
 * 
 *   인스턴스 메서드 : 객체화가 되어야 메서드의 호출이 가능함. 참조변수명.메서드명() 호출해야함
 */

public class MethodEx2 {
	public static void main(String[] args) { // 클래스 메서드
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
	
		System.out.println(m.add1());// 30
		System.out.println("1=====================");
		System.out.println(m.add2(100, 200)); // 300
		System.out.println(m.x);
		System.out.println("2=====================");
		System.out.println(Math2.add2(100, 200)); // 300
	}
}
class Math2 {
	int a, b, x;
	
	int add1() {
		for (int i = 0; i < 5; i++) {		int x=7;		}
		System.out.println(x);
		return a + b;
	}
	
	static int add2(int a1, int a2) {
		int x  = 5;
		return a1+a2;
	}
	
	
}
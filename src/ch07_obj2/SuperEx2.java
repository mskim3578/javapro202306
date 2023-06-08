package ch07_obj2;
public class SuperEx2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Child2 extends Parent {
	int x = 20;
	Child2() {   }
	/*
	 * Child2() { super(100); }
	 */
	void method() {
		int x = 30;
		// x : 1. 지역변수 => 2. 현재 클래스의 멤버 중 x 
		//                => 부모클래스의 객체의 멤버 중 x
		System.out.println(x); // 30
		// 1. 현재 클래스의 멤버 중 x => 부모클래스의 객체의 멤버 중 x
		System.out.println(this.x); // 20
		// 부모클래스의 객체의 멤버 중 x
		System.out.println(super.x);
	}} // 400
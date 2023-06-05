package ch06_obj1;
/*
 * 매개변수 예제.
 * 기본형 매개변수 : read only
 * 참조형 매개변수 : read & write
 */
public class ParameterEx1 {
	public static void main(String[] args) {
		Value v = new Value();//v=999
		v.val = 100;
		change1(v.val);
		System.out.println("2:change1(100) 이후 :" + v.val);
		change2(v);
		System.out.println("4:change2(1000:주소) 이후 :" + v.val);}

	static void change1(int val) {   // value 
		val += 100;
		System.out.println("1:change1() :" + val);	}

	static void change2(Value v) {   // v instance 주소 
		v.val += 100;
		System.out.println("3:change2() :" + v.val);	}
}
class Value {
	int val;
}
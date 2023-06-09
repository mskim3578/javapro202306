package ch08_interface;
/*
final 제어자 : 변경 불가의 의미.
final 클래스 : 상속 불가 클래스.
             다른 클래스의 부모클래스 불가.
             String 클래스가 final 클래스임.
*/
public final class FinalClass {
}
class SubClass extends FinalClass {
	
}

//String class는 final class임
class SubClass2 extends String {
	
}
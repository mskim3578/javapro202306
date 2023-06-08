package ch07_obj2;
class CastingEx2 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();  //100
		FireEngine fe2 = null;
		fe.water();
		car = fe;   // 조상타입 <- 자손타입 auto casting
	//	car.water();	
		fe2 = (FireEngine) car; //100  자손타입 ← 조상타입  명시적 casting
		fe2.water();
	}
}
class Car {
	String color;	int door;
	void drive() { 		// 운전하는 기능
		System.out.println("drive, Brrrr~");	}

	void stop() {		// 멈추는 기능	
		System.out.println("stop!!!");		}}

class FireEngine extends Car {	// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water!!!");	}}
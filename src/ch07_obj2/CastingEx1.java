package ch07_obj2;

class CastingEx1 {
	public static void main(String args[]) {
		Car car1 = new FireEngine();//100
		//Car car1 = new Car();//100
		Car car2 = null;
		FireEngine fe = null;
		car1.drive();
		fe = (FireEngine) car1; 
		fe.drive();
		car2 = fe;
		car2.drive();	}}


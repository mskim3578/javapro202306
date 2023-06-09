package ch07_obj2;
public class SingletonEx {
	static public  void main(String[] args) {
	//	SingleObject so = new SingleObject(); //생성자 접근 불가. 객체생성불가
		SingleObject so1 = SingleObject.getObject();//100
		SingleObject so2 = SingleObject.getObject();//100
		
		System.out.println(so1+","+so2);
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1+","+o2);
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());	
		so1.setValue(500);
		System.out.println(so1.getValue());//500
		System.out.println(so2.getValue());//500
		if(so1 == so2)
			System.out.println
			("so1참조변수의 객체와 so2 참조변수의 객체는 같은 객체임.");
	}
}
class SingleObject {
	private static SingleObject obj = new SingleObject();  //100
	private  SingleObject() {}
	
	public static SingleObject getObject() {
		//SingleObject.getObject()
		return obj;	}
	
	private int value=100;
	public int getValue() {		return value;		}
	public void setValue(int value) {		//obj.value=5;
		this.value = value;	}	
	
}
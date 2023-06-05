package ch06_obj1;
public class SonataEx1 {
	public static void main(String[] args) {
		System.out.println
		     ("자동차 크기:" + Sonata.width + ","+Sonata.height);
		
		Sonata car1 = new Sonata();
		car1.color = "white";		car1.number = 1234;
		System.out.println("car1:"+car1);//car1.toString() 메서드 호출
		Sonata car2 = new Sonata();
		car2.color = "black";		car2.number = 2345;
		System.out.println("car2:"+car2);
		
		System.out.println("--------------------------------------");
		
		car2.width = 300;
		car1.height = 200;
	
		String temp = "aaa:"+car1;
		System.out.println(temp);
		System.out.println("=================");
		System.out.println("car1:"+car1);
		System.out.println("car2:"+car2);
		
	}	}
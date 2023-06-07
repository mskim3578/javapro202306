package ch06_obj2;

public class SuperEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
	}}


class Parent {
	int x;
	public Parent() {x=400;}
	public Parent(int x) {
		super();
		this.x = x;	}
	
}
class Child extends Parent {
	int y;
	Child(){super(3);}
	
	public Child(int x, int y) {
		super(x);
		this.y = y;
	}
	
	
}
package ch12_API;
public class CloneEx4 {  // deep clone
	public static void main(String[] args) {
		Circle2 c1 = new Circle2(new Point(1, 1), 2.0);
		Circle2 c2 = c1.clone();
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		c1.p.x = 9;		c1.p.y = 9;
		System.out.println("= c1의 변경 후 =");
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);	}}

class Circle2 implements Cloneable {
	Point p;	double r; // 반지름
	Circle2(Point p, double r) {
		this.p = p;		this.r = r;	}
	
	public Circle2 clone() { //  (deep clone)
		Object obj = null;
		try {
			obj = super.clone();
			Circle2 c = (Circle2) obj;
			c.p = new Point(this.p.x, this.p.y);
			return c;
			
		} catch (CloneNotSupportedException e) {}
		return (Circle2) obj;	}
	@Override
	public String toString() {
		return "Circle2 [p=" + p + ", r=" + r + "]";
	}}

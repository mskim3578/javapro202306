package ch06_obj1;

public class ExObj07 {

	public static void main(String[] args) {
		
			Circle[] carr=new Circle[3];
			carr[0] = new Circle(10,10,10); //반지름 : 10, (10,10) 좌표
			carr[1] = new Circle(20,20);    //반지름 : 1, (20,20) 좌표
			carr[2] = new Circle(100);      //반지름 : 100, (0,0) 좌표
			for(Circle c : carr) {
				System.out.println(c);
				c.move(10,10);
				System.out.println(c);
				c.scale(3);
				System.out.println(c);
			
		}

	}

}  // end class

class Circle {
	double r;	int x,y,no;	static int count;
	Circle(int r, int x, int y) {
		this.r=r;
		this.x=x;
		this.y=y;
		no=++count;
		
	}
	Circle(int x, int y) {		this(1, x, y);	}
	Circle(int r) {		this(r, 0,0);	}
	
	double area() {		return Math.PI*(r*r);	}
	double length() {		return 2*Math.PI*r;	}
	void move(int a, int b) {		this.x+=a;		y+=b;	}
	void scale(double m) {		r=r*m;	}
	
	
	public String toString11() {
		return 
		no+"번원 : 반지름:"+(int)r +", 좌표 :("+x+","+y+"), 넓이 :"
				+ String.format("%.3f", area() )
		+ ", 둘레:"+ String.format("%.3f",length());
}
}

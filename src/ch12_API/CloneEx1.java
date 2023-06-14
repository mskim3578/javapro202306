package ch12_API;
class CloneEx1 {
	public static void main(String[] args)  {
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone(); // 복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
		System.out.println(original==copy);  //주소 확인
	}	}
/*
Object clone()은 protected이기 때문에 
clone() 메소드를 만들어서 class내부에서 사용 하여야한다 
clone()은 반드시 예외처리를 해주어야 한다.   */
class Point implements   Cloneable{
	int x;  int y;
	public Point(int x, int y) {
		super();
		this.x = x;		this.y = y;	}
	@Override
    public Object clone()  {
    	// TODO Auto-generated method stub
		try {
    	return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		return null;    }
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	
}


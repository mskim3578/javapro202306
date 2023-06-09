package ch08_interface;
class InterfaceEx2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.methodA2();
	}
}

 class A2 {
    void methodA2() {
          I2 i = InstanceManager.getInstance();
		  i.methodB2();
		  System.out.println(i.toString()); // i로 Object클래스의 메서드 호출가능
     } }
 interface I2 {	 
	 void methodB2(); }
 
 
 class InstanceManager {
	 
	 static I2 getInstance(){
		 return new B3();	 }	 
 }
 class B2  implements  I2 {
	@Override
	public void methodB2() {
		  System.out.println("methodB in B2 class");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class B2";	}
 }
 class B3  implements  I2 {

		@Override
		public void methodB2() {
			  System.out.println("methodB in B3 class");
		}	
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "class B3";
		}
	 }

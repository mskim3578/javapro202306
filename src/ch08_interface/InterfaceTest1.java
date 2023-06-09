package ch08_interface;

class InterfaceTest1 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.autoPlay(new B1()); // void autoPlay(I i)호출
		a.autoPlay(new C1()); // void autoPlay(I i)호출
	}
}

class A1 {
    void autoPlay(I1 i) {
          i.play();
     }
 }
interface I1 {
    void play();
}

class B1 implements I1 {
   public void play() {
        System.out.println("play in B class");
   }
}

class C1 implements I1 {
   public void play() {
        System.out.println("play in C class");
   }
}
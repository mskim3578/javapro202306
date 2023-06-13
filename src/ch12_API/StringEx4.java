package ch12_API;
/*
 * String은 값의 대입에 따라 주소가 설정됨
 * str의 주소가 값의 입력에 따라 바뀐다 
 * 
 */

public class StringEx4 {

	public static void main(String[] args) {
		String str = "ABC"; // 100
		String str1 = "ABC"; // 100
		System.out.println("1)str  hashcode():" 
		+ System.identityHashCode(str) 
		+ "," + System.identityHashCode(str1));
		System.out.println("main :" + str);
		change(str); // 주소 설정 하지 않음
		System.out.println("2)str  hashcode():" 
		+ System.identityHashCode(str) + "," 
				+ System.identityHashCode(str1));
		System.out.println("change 이후 main 재설정 않함:" + str);
		str = change(str); // 주소 재설정 : read only (기본형 타입 같음)
		System.out.println(
				"3)str 주소 재설정  hashcode():" 
		+ System.identityHashCode(str) 
		+ "," + System.identityHashCode(str1));	}
	static String change(String str) {  // 
		str += "456"; // 주소가 변경된다
		System.out.println("change() s :" + str 
				+ ":" + System.identityHashCode(str));
		return str;	}
}



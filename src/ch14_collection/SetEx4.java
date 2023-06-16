package ch14_collection;
/*
 * 정렬 관련 인터페이스
 * Comparable 인터페이스 : 추상메서드 compareTo(Object)
 *                      클래스의 기본 정렬 방식 지정 
 * Comparator 인터페이스 : 추상메서드 compare(Object o1, Object o2)
 *                      기본정렬 방식 대로 정렬하지 않고 사용자가 임의로 정렬 방식을 지정                     
 */

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		
		System.out.println("나이순으로 출력");
		SortedSet<Person2> set = new TreeSet<>(); //Compareble
		set.add(new Person2("홍길동", 33));
		set.add(new Person2("김삿갓", 22));
		set.add(new Person2("이몽룡", 55));
		System.out.println(set);
		/*
		set = new TreeSet<>(new Comparator<Person2>() {  //Comparator

			@Override
			public int compare(Person2 o1, Person2 o2) {
				// TODO Auto-generated method stub
				return o2.age - o1.age;
			}

			
		
		});
		*/
		
		set = new TreeSet<>(new DescPerson2());
		
		System.out.println("나이의 역순으로 출력");
		set.add(new Person2("홍길동", 33));
		set.add(new Person2("김삿갓", 22));
		set.add(new Person2("이몽룡", 55));
		System.out.println(set);
	}
}

class DescPerson2 implements Comparator<Person2> {
	@Override
	public int compare(Person2 o1, Person2 o2) {
		// TODO Auto-generated method stub
		return o2.age - o1.age;
	}
}
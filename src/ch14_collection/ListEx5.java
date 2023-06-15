package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 16));
		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		print(li );
		System.out.println("==================");
		Collections.sort(li);  //Comparable
		
		print(li );
		
	}
	public static void print(List li) {
		for (Object ob : li) {
			System.out.println(ob);
		}
	}
}
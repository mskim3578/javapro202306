package ch15_lambda;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


//ListEx6
public class LambdaComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<Person> li = new ArrayList<Person>();
				li.add(new Person("홍길동", 10));
				li.add(new Person("홍길동", 10));
				li.add(new Person("홍길동", 30));
				li.add(new Person("이정민", 10));
				li.add(new Person("김윤민", 16));
				Person p1 = new Person("김삿갓", 20);
				li.add(p1);				print(li );
				System.out.println("==================");
				Collections.sort(li, (o1, o2) ->o1.age-o2.age);  				
				print(li );	
				System.out.println("==================");
				Collections.sort(li, (o1, o2) ->(o1.age-o2.age)*-1);  				
				print(li );	
				System.out.println("==================");
				Collections.sort(li, (o1, o2) ->(o1.name.compareTo(o2.name))); 				
				print(li );	
				System.out.println("==================");
				Collections.sort(li, (o1, o2) ->(o1.name.compareTo(o2.name))*-1); 				
				print(li );	
				
	
	}
	public static void print(List li) {
		for (Object ob : li) {
			System.out.println(ob);
		}}}

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
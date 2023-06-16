package ch14_collection;
/*
 * 객체의 중복을 논리적 판단하는 기준(동등객체)
 *  1. equals(Object) : 결과가 true
 *  2. hashCode()     : 결과가 동일
 *  두개의 메서드가 Object의 멤버 메서드임
 *  => equals 메서드를 오버라이딩   
 *  => hashcode() 메서드도 오버라이딩 
 *  => toString() 메서드 오버라이딩 
 *  
 *  String equals(), hashCode() 오버라이딩
 */

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("홍길동", 10));
		set.add(new Person2("홍길동", 10));
		set.add(new Person2("홍길동", 30));
		set.add(new Person2("이정민", 10));
		set.add(new Person2("김윤민", 16));
		print(set);
		System.out.println("================");
		Person2 p1 = new Person2("김삿갓", 20);
		System.out.println("p1:"+p1);
		Person2 p2 = new Person2("김삿갓", 20);
		System.out.println("p2:"+p2);
		//p2=p1;
		System.out.println("p2:"+p2);
		set.add(p1);
		set.add(p2);
		print(set);
	}
	
	public static void print(Set li) {
		for (Object ob : li) {			System.out.println(ob);		}
	}
}
// Person2에 동등객체 정의 
class Person2 implements   Comparable<Person2>{
	String name;	int age;
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person2 o) {
		// TODO Auto-generated method stub
		return age-o.age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		Person2 p = (Person2) obj;
		return name.equals(p.name) && age == p.age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name.hashCode()+age);
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}


	
	
	
	
	
	
}
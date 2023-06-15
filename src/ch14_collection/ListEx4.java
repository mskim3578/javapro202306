package ch14_collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//동등객체 : equals(), hashcode() 재정의
//indexOf() 는 equals()만을 비교한다 
public class ListEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));  //member:  name, age
		li.add(new Person("홍길동", 10));		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));		li.add(new Person("김윤민", 16));
		Person p1 = new Person("김삿갓", 20);  //600
		li.add(p1);  //p1=600
		print(li );
		System.out.println(li.indexOf(new Person("홍길동", 10)));  //-1
		//indexOf() 는 equals()만을 비교한다
		System.out.println(li.indexOf(p1)); //5
	}
	public static void print(List li) {
		for (Object ob : li) {	System.out.println(ob);		}	}}

class Person implements  Comparable<Person>{
	String name;	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name)* -1;
		//return (age-o.age) * -1;
		
		// 0==int, 0<int, 0>int
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Person p = (Person) obj;
		
		return name.equals(p.name) && age == p.age;
		
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	




	

		
	}


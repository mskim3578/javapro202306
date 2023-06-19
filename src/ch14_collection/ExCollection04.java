package ch14_collection;
/*
 * 생성자 : Student3(stuno, name, kor, math, eng)
 * 
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class ExCollection04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/ch14_collection/student.txt"));
		List<Student3> li = new ArrayList<Student3>();
		
		while(sc.hasNextLine()) {
		//	System.out.println(sc.nextLine());
			String line = sc.nextLine();
			String[] str = line.split(",");
			Student3 st = new Student3(str[0], str[1], 
					Integer.parseInt(str[2]),
					Integer.parseInt(str[3]),
					Integer.parseInt(str[4]));
			li.add(st);
			System.out.println(st);
		}
		
		System.out.println("1. 학번순(descending) 프린트 (Comparable)");
		Collections.sort(li);
		printList(li);
		
		System.out.println("2. 이름순 프린트 (Comparator)");
		
		Collections.sort(li, new Comparator<Student3>() {

			@Override
			public int compare(Student3 o1, Student3 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}			
		});
		printList(li);
		
		System.out.println("3. 총점순 프린트 (Comparator)");
		Collections.sort(li, new Comparator<Student3>() {

			@Override
			public int compare(Student3 o1, Student3 o2) {
				// TODO Auto-generated method stub
			//	return (o1.kor+o1.eng+o1.math)-(o2.kor+o2.eng+o2.math);
				return (o1.tot)-(o2.tot);
			}			
		});
		printList(li);
		
	}
	
	
	static void printList(List<Student3> li) {
		for (Student3 s : li) {
			System.out.println(s);
		}
	}
	
	
	
}
class Student3 implements  Comparable<Student3>{
	String stuno;
	String name;
	int kor;
	int math;
	int eng;
	int tot;
	public Student3(String stuno, String name, int kor, int math, int eng) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		tot=(kor+math+eng);
	}
	@Override
	public String toString() {
		return "Student3 [stuno=" + stuno + ", name=" + name + ", kor=" + kor 
		//		+ ", math=" + math + ", eng=" + eng +", tot=" + (kor+eng+math)+ "]";
		+ ", math=" + math + ", eng=" + eng +", tot=" + tot+ "]";
	}
	@Override
	public int compareTo(Student3 o) {
		// TODO Auto-generated method stub
		return stuno.compareTo(o.stuno)*-1;
	}
	
	
	
}
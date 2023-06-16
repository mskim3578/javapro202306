package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 홀수개의 숫자를 list에 add해서 sort를 하고   평균과 중간값을 출력하기
 * 
 * 10 40 30 60 30 70 55 
 * 
 * 10 30 30 40 55 60 70 
 * 평균값 : ...
 * 중간값 : 30 
 */
public class ExCollection01 {

	public static void main(String[] args) {
		
		int sum=0;
		List<Integer>  li = new ArrayList<>();
		li.add(10);
		li.add(40);
		li.add(30);
		li.add(60);
		li.add(30);
		li.add(70);
		li.add(55);
		for (int n : li) {
			sum+=n;
		}
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		System.out.println("평균:"+sum/li.size());
		System.out.println("중간값:"+li.get(li.size()/2));

	}

}

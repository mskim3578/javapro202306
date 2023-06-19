package ch14_collection;

import java.util.Set;
import java.util.TreeSet;

/*
 * Set  예제 : 중복불가, 정렬
 * Lotto 번호(1 ~ 45) 생성기 Set을 이용하여 출력하기
 */
public class ExCollection03 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45+1));
		}
		System.out.println(lotto);
		
	}
	}
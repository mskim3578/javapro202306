package ch13_thread;

import java.util.ArrayList;
import java.util.List;

/*
 * 동기화 : synchronized 예약어 표현.
 *   동기화 블럭 : ThreadEx5.java
 *             lock 객체를 소유한 스레드만 동기화 영역을 실행
 *             lock 은 Object 객체여야 한다. 객체여야함. 
 *             기본자료형은 lock으로 사용할 수 없다. 
 *             모든 스레드가 공유하는 공유 객체여야 함.
 *   
 */
class PrintThread extends Thread {
	char ch;
	PrintThread(char ch) {		this.ch = ch;	}
	//static int[] lock = new int[3];
	//static List lock = new ArrayList();
	//static int lock;  // 참조형만 가능 
	static String lock = "aaa";
	public void run() {
		for(int i=0;i<20;i++) {
			synchronized (lock) {
				for(int j=0;j<80;j++) {
					System.out.print(ch);
				}
				System.out.println();}	
		}	}}
public class ThreadEx5 {
	public static void main(String[] args) {
		Thread t1 = new PrintThread('A');
		Thread t2 = new PrintThread('B');
		Thread t3 = new PrintThread('C');
		t1.start();t2.start();t3.start();
	}}
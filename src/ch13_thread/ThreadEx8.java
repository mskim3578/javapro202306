package ch13_thread;
/*
 *  생산자 스레드, 소비자 스레드 예제.
 *  
 *  엄마와 아들은 하나의 계좌를 공유한다.
 *  계좌에 잔액이 0이면 아들은 wait() 상태로 변경되고, 
 *  엄마는 계좌에 잔액이 있으면 wait() 상태로.
 *  엄마는 잔액이 0원이면 10000,20000,30000원 중 한개만 입급한다.
 *  엄마 0 ~ 3000 동안 sleep
 *  아들 0 ~ 1000 동안 sleep
 */
public class ThreadEx8 {
	public static void main(String[] args) {
		Account acc = new Account();  //100
		Thread mother = new Mother(acc);
		Thread son = new Son(acc);
		son.start(); mother.start();
	}}
class Mother extends Thread {
	Account account;  //100
	Mother(Account account) {		super("엄마스레드");
		this.account = account;	}
	public void run() {
		for(int i=0;i<20;i++) {
			account.input();
			try {
				sleep((int)(Math.random() * 3000));//0 ~ 3초 동안 임의로 sleep
			} catch(InterruptedException e) {}
		}
	}}

class Son extends Thread {
	Account account;  //100
	Son(Account account) {
		super("아들스레드");
		this.account = account;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			account.output();
			try {
				sleep((int)(Math.random() * 1000)); //0 ~ 1초
			} catch(InterruptedException e) {}
		}
	}
}

class Account {
	int money; //잔액
	synchronized void output() { //출금
		while(money == 0) {
			try {
				wait(); //son 스레드 대기
			} catch(InterruptedException e) {}
		}
		notifyAll(); //wait() 상태인 스레드 모두 Runnable 상태로 변환
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 출금");
		money = 0;
	}
	synchronized void input() { //입금
		while(money > 0) {
			try {
				wait(); //엄마스레드가 wait()
			} catch(InterruptedException e) {}
		}
		money = ((int)(Math.random() * 3) + 1) * 10000;//1만,2만,3만
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 입금");
	}
}


















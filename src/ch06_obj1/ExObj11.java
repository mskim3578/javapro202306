package ch06_obj1;

public class ExObj11 {
	public static void main(String[] args) {
		// 객체 생성
		Account a = new Account("123-45", 10000);
		Account b = new Account("567-89", 10000);
		// 송금: 3천원씩 a 계좌에서 -> b계좌로!
		boolean result = true;
		while (result) {
			result = a.transfer(b, 3000);		}
		System.out.println("====================");
		// 결과 출력
		System.out.println(a); // name : balance print
		System.out.println(b);	}}
class Account {
	String name;	int balance;
	public Account(String name, int balance) {
		this.name = name;		this.balance = balance;	}
	
	boolean transfer(Account b, int amount) {
		if (balance<amount) {
			System.out.println("잔액이 부족 합니다");
			return false;}
		balance -=amount;		b.balance +=amount;
		System.out.println(this);
		return true;	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}

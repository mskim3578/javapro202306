package ch15_lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LambdaStream {
	static String carName = "그랜저";
	static int con = 2;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader br 
		= new BufferedReader(new FileReader("src/ch14_collection/product.txt"));
		br.lines().map(s -> new Product(s))
		.filter(p -> p.getCarname().equals(carName) && p.getCon() == con)
		.forEach(p -> System.out.println(p));
		
		Scanner sc = new Scanner(new File("src/ch14_collection/product.txt"));
		sc.tokens()
		.map(s -> new Product(s))
		.collect(Collectors.groupingBy(s -> s.getMon()))
		.forEach((k, v) -> {
			System.out.println(k + "월>");
			for (Product p : v) {
				System.out.println(p);
			}
		});		
	}
}

class Product { // ExCollection05
	int mon;
	int con;
	String carname;
	int qty;
	String remark;

	public int getMon() {
		return mon;
	}

	public int getCon() {
		return con;
	}

	public String getCarname() {
		return carname;
	}

	public int getQty() {
		return qty;
	}

	public String getRemark() {
		return remark;
	}

	public Product(String line) {
		super();
		String[] str = line.split(",");
		this.mon = Integer.parseInt(str[0]);
		this.con = Integer.parseInt(str[1]);
		this.carname = str[2];
		this.qty = Integer.parseInt(str[3]);
		try {
			this.remark = str[4];
		} catch (Exception e) {
			remark = "";
		}
	}

	@Override
	public String toString() {
		return "Product [mon=" + mon + ", con=" + con + ", carname=" + carname + ", qty=" + qty + ", remark=" + remark
				+ "]";
	}
}

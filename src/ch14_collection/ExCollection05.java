package ch14_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//Product(mon,con,carname, qty, remark); 
/*
 * 1) 월별 리스트
 * 2) 월별 생산, 판매, 반품 합계현황
 * 3) 제품별 총 생산, 판매, 반품  현황
 * 4) 월별 제품별 생산, 판매, 반품 현황
 * 
 */
import java.util.TreeMap;

public class ExCollection05 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/ch14_collection/product.txt"));
		List<Product> li = new ArrayList<Product>();
		while (sc.hasNextLine()) {
			// System.out.println(sc.nextLine());
			String line = sc.nextLine();
			Product pd = new Product(line);
			li.add(pd);
			System.out.println(pd);
		}
		System.out.println(li.size());
		
		System.out.println("1) 월별 리스트");  // map(mon, list)
		Iterator<Product> it = li.iterator();
		Map <Integer, List<Product>> map1 = new HashMap<>();
		// map(mon, list)
		while(it.hasNext()) {
			Product p = it.next();
			if (!map1.containsKey(p.mon)) map1.put(p.mon, new ArrayList<Product>());
			map1.get(p.mon).add(p);
		}
		
		//System.out.println(map1);
		
		for (Integer m : map1.keySet()) {
			System.out.println(m + "월>");
			List<Product> li1 = map1.get(m);
			for (Product p1 : li1) {
				System.out.println(p1);
			}
		}
		
		int tot=0;
		System.out.println("2) 월별 \t 생산 \t 판매 \t 반품 합계현황");  
		//생산:1  판매:2  반품:3
		Iterator<Product> it2 = li.iterator();
		Map <Integer, int[]> map2 = new HashMap<>();
		
		
		while(it2.hasNext()) {
			Product p = it2.next();
			if (!map2.containsKey(p.mon)) map2.put(p.mon, new int[3]);
			map2.get(p.mon)[p.con-1]+=p.qty;
		}
		//System.out.println(map2.keySet());
		
		for (Integer m : map2.keySet()) {
			System.out.print(m + "월:\t");
			int[] arr = map2.get(m);
			for (int p1 : arr) {
				System.out.print(p1+"\t");
				tot+=p1;
			}
			System.out.println();
		}
		System.out.println(tot);
		tot=0;
		
		System.out.println("3) 제품별 총 생산, 판매, 반품  현황");
		it = li.iterator();
		Map <String, int[]> map3 = new HashMap<>();
		
		while(it.hasNext()) {
			Product p = it.next();
			if (!map3.containsKey(p.carname)) map3.put(p.carname, new int[3]);
			map3.get(p.carname)[p.con-1]+=p.qty;
		}
		
		for (String m : map3.keySet()) {
			System.out.print(m + "\t");
			int[] arr = map3.get(m);
			for (int p1 : arr) {
				System.out.print(p1+"\t");
				tot+=p1;
			}
			System.out.println();
		}
		System.out.println(tot);
		
		System.out.println("4) 월별 제품별 생산, 판매, 반품 현황");
		it = li.iterator();
		Map <String, int[]> map4 = new TreeMap<>();
		
		while(it.hasNext()) {
			Product p = it.next();
			String key = (p.mon>9?p.mon+"":"0"+p.mon)+":"+p.carname;
			if (!map4.containsKey(key)) map4.put(key, new int[3]);
			map4.get(key)[p.con-1]+=p.qty;
		}
		System.out.println(map4.keySet());
		
		
		String mon="";
		for (String m : map4.keySet()) {
			String[] str = m.split(":");
			if (!str[0].equals(mon))
				System.out.println(str[0]+"월>");
			mon=str[0];
			System.out.print("\t" + str[1]+"\t");
			
			
			
			int[] arr = map4.get(m);
			for (int p1 : arr) {
				System.out.print(p1+"\t");
				
			}
			System.out.println();
		}	
		
			
		
	}
}

class Product {
	int mon;
	int con;
	String carname;
	int qty;
	String remark;

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

package com.atgugui.java;
/*
 * 
 * 变量的传递
 * */
public class ValueTransferTest {
	public static void main(String[] args) {
		int m=10;
		int n=m;
		System.out.println(m);
		
		m=20;
		System.out.println(n);
		
		Order o1=new Order();
		o1.OrderId=1001;
		
		Order o2=o1;
		o2.OrderId=o1.OrderId;
		
		System.out.println(o2.OrderId);
		
		o1.OrderId=1002;
		System.out.println(o2.OrderId);
		
	}

}
class Order{
	
	int OrderId;
}
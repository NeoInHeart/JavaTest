package com.atguigu.exer;

public class CustomerTest {
	public static void main(String[] args) {
		Account ac1=new Account(119,2541,0.13);
		Customer cs1=new Customer(ac1);
		
		//客户存钱操作
		cs1.getAccount().deposit(200);
		System.out.println(cs1.getAccount().getBalance());
		
		//客户取钱操作
		cs1.getAccount().withdraw(700);
		System.out.println(cs1.getAccount().getBalance());
		cs1.getAccount().showMessage();
		
	}

}

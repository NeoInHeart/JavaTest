package com.atgugui.exer;

import com.atguigu.java.Order;

public class OrderTest1 {
	public static void main(String[] args) {
		Order n=new Order();
		
		n.OrderPublic=1;
		n.MethodPublic();
		//在不同的包内调用类时，只有这public的属性和类可以使用。
	}

}

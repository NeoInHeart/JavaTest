package com.atguigu.java;

public class Order {
	private int OrderPrivate;
	int OrderDefualt;
	public int  OrderPublic;
	
	
	public void MethodPublic(){
		OrderPrivate=1;
		OrderDefualt=2;
		OrderPublic=3;		
	}
	
	private void MethodPrivate(){
		OrderPrivate=3;
		OrderDefualt=2;
		OrderPublic=1;
	}
	
	protected void MethodProtected(){
		OrderPrivate=2;
		OrderDefualt=2;
		OrderPublic=2;
	}
}

package com.atgugui.java;
/*
 * 方法的重载（overload）
 * 
 * 区分方法的重载与重写。
 * 
 * */
public class OverLoadTest {
	public static void main(String[] args) {
		System.out.println("方法重载");
	}
}

class Person{
	public String getname(String name){
		return name;
	}
	
	public int getname(int num){
		
		return num;
	}
	
	public void getname(){
		
		System.out.println("This is the new name.");
	}
	
}
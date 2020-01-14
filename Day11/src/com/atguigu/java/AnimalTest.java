package com.atguigu.java;
/*
 * 面向对象的基础特征：封装与隐藏
 * 
 * 2.封装性体现（狭义上）
 * 将类进行私有化，提供公共的get()和set()方法来获取和设置属性
 * 
 * 3.封装性体现（广义上）
 * java规范的4类权限修饰器：private<(省略关键字)<protected<public
 *   4种权限可以修饰类内部的成员：属性、方法、构造器、内部类
 * 
 * */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a =new Animal();
		a.eat();
		a.leg=10;
		a.setLeg(21);
		System.out.println(a.leg);
	}

}
class Animal{
	
	String name;
	int leg;
	public void eat(){
		System.out.println("开始进食！");
	}
	
	public void sleep(){
		System.out.println("准备睡觉！");
	}
	
	public void setLeg(int l){
		if(l<0||l%2==0||l>30){
			System.out.println("输入内容不合法。");
		}
		else{
			System.out.println("开始测量腿的长度。");
			leg=l;
		}		
	}
	
	//获取变量
	public String getName(){	
		return name;	
	}
	
	//设置变量
	public void setName(String n){	
		name=n;
	}
}

/**
 * 
 */
package com.atguigu.block;

import java.security.GeneralSecurityException;

/**
 * @author liang  qiang
 * @version 2020年1月19日 下午5:15:11
 */
/*
 * 实例化初始化的过程。
 *  (1)实例初始化，调用/执行实例初始化的方法<init>(....)
 *  (2)实例初始化方法的方法体由三部分组成：
 *  1、属性显示赋值
 *  2、非静态代码块
 *  3、构造器
 *  (3) 当创建的是子类对象时，会先执行父类的实例初始化方法。
 *  
 *  
 *  
 * 
 */
public class TestInit1 {
	public static void main(String[] args) {
		B B1=new B(1);		
	}	
}

class A{
	private int a=getInt();
	
	{
		a++;
		System.out.println("(1)执行非静态代码块");
		System.out.println("(1)a= "+a);
	}
	public A(){
		
	}
	A(int num){
		a=num;
		System.out.println("(2)A：有参数构造");
		System.out.println("(2)a= "+a);
	}
	
	public int getInt(){
		System.out.println("(3)A->getInt");
		System.out.println("(3)a= "+a);
		return 1;	
	}	
}

class B extends A{
	private int b=getValue();
	
	{
		b++;
		System.out.println("(1)执行非静态代码块");
		System.out.println("(1)b= "+b);
	}
	B(int num){
		b=num;
		System.out.println("(2)A：有参数构造");
		System.out.println("(2)b= "+b);
	}
	
	public int getValue(){
		System.out.println("(3)B->getValue");
		System.out.println("(3)b= "+b);
		return 1;	
	}	
	
}
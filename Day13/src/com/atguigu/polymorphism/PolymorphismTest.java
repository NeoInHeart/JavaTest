/**
 * 
 */
package com.atguigu.polymorphism;

/**
 * @author liang  qiang
 * @version 2020年1月17日 下午4:58:35
 */
/*
 * 多态性是指方法的多种形态
 * 1.方法的重载和方法的重写
 * 2.对象的多态性
 * 对象有两种形态：(1)编译时类型(2)运行时类型
 * 编译时按照父类编译，运行时执行的是子类的重写方法体。
 * 前提条件：(1)类的继承关系(2)多态引用(3)方法的重写
 * 
 */
public class PolymorphismTest {
	public static void main(String[] args) {
		Person p=new Man();
		p.walk();
	}
}
class Person{
	public void walk(){
		System.out.println("人员走路。");
	}
}

class Man extends Person{
	public void walk(){
		System.out.println("男人走路。");
	}
	public void smoke(){
		System.out.println("男人抽烟。");
	}	
}


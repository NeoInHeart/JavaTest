/**
 * 
 */
package com.atguigu.object;

/**
 * @author liang  qiang
 * @version 2020年1月19日 下午4:22:41
 */
/*
 * 对匿名代码块的调用的方法
 * 类的基本成员包括：(1)属性   (2)方法   (3)构造器
 * 类中第四组成员：代码块
 * 作用：为属性初始化。
 * 
 * 语法的格式为：
 * [修饰符] class 类名  [extends 父类]{
 * 		{
 *        非静态代码块。
 *      }
 * }
 * 
 * 代码块要先于构造器执行
 * 在创建对象时自动执行，没创建一个对象就会执行一次。
 * 每一个实例在初始化时由三部分组成：
 * 1、属性的显示初始化，赋值
 * 2、非静态代码块
 * 3、对应构造器的代码
 * 
 * 如果创建子类对象，会先执行对应的父类的实例初始化方法，
 * 执行哪个父类的实例初始化方法，要看子类构造器调用的是哪个父类的构造器。
 * 
 */
public class TestNoneStaticBlock {
	public static void main(String[] args) {
		Person1 p1=new Person1();
	}
}

class Person1{
	public Person1(){
		
		System.out.println("执行的是构造器");
	}
	{
		System.out.println("非静态的代码块！");
	}
}
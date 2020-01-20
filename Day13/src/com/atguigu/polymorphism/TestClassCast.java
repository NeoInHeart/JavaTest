/**
 * 
 */
package com.atguigu.polymorphism;

/**
 * @author liang  qiang
 * @version 2020年1月19日 上午11:54:13
 */
/*
 * 数据类型的转换
 * 基础的数据类型转换基本上就是从上到下或者从下到上的过程。
 * 当出现数据引用类型时
 * (1)向上转型
 * 当出现多类引用时，子类的对象就会向上转型为父类的类型
 * 
 * 一旦向上转型，通过父类变量，就无法调用子类的”扩展“方法
 * 
 * (2)向下转型
 * 当把存在父类中的变量的对象，重新赋值给子类的变量，就需要向下转型
 * 
 * 关键字instanceof 的使用方法
 * 对象 instanceof 类型：判断这个对象是否属于这个类型。
 * 
 * 
 */
public class TestClassCast {
	public static void main(String[] args) {
		DoorMan dm=new DoorMan();
		Human h=new American();
		dm.welcome(h);
	}
	
}
class DoorMan{
	
	public void welcome(Human h){
		System.out.println("你好，欢迎光临哈！");
		if(h instanceof Chinese){
			Chinese c=(Chinese) h;
			c.say();
		}else if(h instanceof American){
			American a=(American) h;
			a.say();
		}
	}
}
class Human{
	public void say(){
		System.out.println("哈哈");
	}
	
} 
class Chinese extends Human{
	public void say(){
		System.out.println("今天吃了吗？");
	}
	
	public void meet(){
		System.out.println("嘿嘿，见到你很高兴哈。");
	}
}

class American extends Human{
	public void say(){
		System.out.println("Hello, MoMo");
	}
	
	public void meet(){
		System.out.println("hello");
	}
}


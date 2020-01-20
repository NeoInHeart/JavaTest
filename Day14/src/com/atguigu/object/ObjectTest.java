/**
 * 
 */
package com.atguigu.object;

/**
 * @author liang  qiang
 * @version 2020年1月19日 下午2:35:26
 */
/*
 * Object是根父类，如何理解？
 * 从继承的角度来分析：
 * (1)所有的类对象的都是它的子类
 * (2)所有的类，所有对象的都拥有Object类中的方法
 * (3)每一个类的构造器，往上追踪都会调用到Object类的无参构造方法。
 * 从多态的角度分析：
 * (1)Object的变量可以接收任意类型的对象。
 * (2)Object的数组，可以存储任意类型的对象。
 * 
 * 数组也是引用数据类型，数组对象也是属于是object的子类对象。
 * 
 * 
 */
public class ObjectTest {
	public ObjectTest(){
		super();
		
	}
	
	public static void main(String[] args) {
		ObjectTest ot =new ObjectTest();
		
		//for example
		
		int[] arr =new int[5];//arr也是属于object的数据类型。
		
		
		
	}

}

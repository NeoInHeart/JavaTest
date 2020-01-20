/**
 * 
 */
package com.atguigu.exer;

/**
 * @author liang  qiang
 * @version 2020年1月17日 上午9:14:37
 */
/*
 * 1、声明一个Person类，包含姓名和年龄
 *  选择生成哪些构造器
 *  （1）没有什么特殊情况，一般无参构造器都保留
 *  （2）其他的有参构造，可灵活选择
 *  标准、让别人调用构造器，有多种方式来创建对象。
 */
public class Person {
	private String name;
	private int age;
	
	//注意保留无参构造。
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getInfo(){
		return "姓名："+name+" 年龄: "+age;
	}
	

}

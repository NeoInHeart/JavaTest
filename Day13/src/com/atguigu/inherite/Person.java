/**
 * 
 */
package com.atguigu.inherite;

/**
 * @author liang  qiang
 * @version 2020年1月16日 下午5:39:49
 */
public class Person {
	//属性
	private String name;
	private int age;
	
	public Person(){
		
		
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
	//自建的构造器
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 

}

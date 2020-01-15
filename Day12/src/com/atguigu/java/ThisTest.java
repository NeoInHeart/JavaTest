package com.atguigu.java;
/*
 * this关键字的使用：
 * 1.可理解为当前对象 或者 当前操作的对象。
 * 2.使用范围：this可以使用在方法的或构造器的内部
 * 3.可以调用的结构：属性、方法、构造器
 * 4.在方法中使用this:
 * 	 可以在方法内调用当前类的属性或者方法，属性或方法前可以使用"this"的方式，
 * 	 表明调用的是当前的对象的属性或者方法。
 *   但是，通常情况下习惯性省略this关键字。
 *   但是如果方法的形参和类的属性名相同，则必须使用"this"关键字
 *5.在构造器内使用this:
 *	可以在构造器内使用this()调用此类中其他自己构建的构造器。
 *	要求将this(形参列表)生命在构造器的首行位置。
 *	一个构造器内最多声明一个“this（形参列表）”
 *
 * 
 * */
public class ThisTest {
	public static void main(String[] args) {
		Personal p1 =new Personal("li Ming",20);
		
		//p1.study(20);
		
	}

}

class Personal{
	String name;
	int age;
	
	public Personal(){
		System.out.println("初始化构造器");
	}
	//自建构造器
	public Personal(String name,int m){
		this();
		this.name=name;
		age=m;
	}
	
	public Personal(int age){
		this("zhang ming",40);
		this.age=age;
	}
	/**输出该个人的成绩.
	 * 
	 * @param s
	 */
	public void study(int s){
		System.out.println(name+" get "+s+" score.");
	}
	
	public String setName(){
		return name;
	}
	public void getName(String n){
		name=n;
	}
	
	public int setAge(){
		return age;
	}
	public void getAge(int n){
		age=n;
	}
	
	public void show(){
		
		System.out.println("name: "+this.name+"age: "+this.age);
	}
	
}

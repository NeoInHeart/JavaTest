package com.atguigu.java1;
/*
 * 类的成员之三：构造器（或者叫构造方法），Constructor
 *     construct:用来创建类对象。自己构建的构造器可以初始化属性值。
 *     
 *  说明：
 *  1.  当没有显示的提供构造器的话，系统默认提供一个构造器：无参数
 *  2.  若显示的声明类的构造器时格式为：权限修饰符  类名(形参列表){} 
 *  
 *  当自定义构造器后系统中默认构造器将不再起作用。
 * */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 =new Person("Li Ming",12);//构造器
		p1.show();	
	}
}

class Person{
	String name;
	int age;
	
	public void eat(){	
		System.out.println("开始吃啦");		
	}
	//自己定义构造器1
	public Person(){
		System.out.println("自己的构造器。");		
	} 
	//自己定义构造器2
	public Person(String n,int m){
		name=n;
		age=m;		
	}
	/*
	 * 显示
	 */
	public void show(){
		System.out.println("name: "+name +"\n"+"age: "+age);	
	}
    //显示函数
	public void showup(String n,int m){
		name=n;
		age=m;
		System.out.println("name: "+name +"\n"+"age: "+age);	
	}
	
}
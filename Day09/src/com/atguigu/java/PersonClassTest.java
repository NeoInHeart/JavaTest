package com.atguigu.java;
/*
 * 1.类的创建：属性的建立、方法的常见
 * */
import java.util.Scanner;
public class PersonClassTest {
	public static void main(String[] args){
	
	
	Scanner scan=new Scanner(System.in);
	Person p1=new Person();
	System.out.println(p1);
	
	//类的实例化
	System.out.println("请输入年龄大小： ");
	p1.age=scan.nextInt();
	System.out.println("请输入客户姓名： ");
	p1.name=scan.nextLine();
	
	System.out.println("实例化的用户的姓名： "+p1.name);
	
	p1.eat();
	}

}

class Person{
	
	String name;
	int age=1;
	char sex;
	
	public void eat(){
		System.out.println("Do you like to eat");
	}
	
	public void Show(String actions){
		
		System.out.println("您输入的操作内容为："+actions);
		
		
	}
	
}
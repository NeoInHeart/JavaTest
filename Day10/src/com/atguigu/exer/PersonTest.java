package com.atguigu.exer;
import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args ){
		Person p1=new Person();
		p1.age=20;
		p1.name="Jack Ma";
		p1.age=1;
		
		p1.Study();
		p1.ShowAge(30);
		
		System.out.println("请更新年龄：");
		Scanner scan =new Scanner(System.in);
		int age1=scan.nextInt();
		p1.age=p1.AddAge(age1);	
	}
}


class Person {
	String name;
	int age;
	int sex;
	
	public void Study(){
		System.out.println(name+" is Studying!");
	}
	
	public void ShowAge(int age){
		System.out.println("age is "+age);
	}
	
	public int AddAge(int age){
		return age;
	}
}

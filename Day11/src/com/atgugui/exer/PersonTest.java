package com.atgugui.exer;
/*
 * 将int型转换成string
// * 第一种方式：String的valueOf方法，
//int i=1;
//String s=String.valueOf(i);
//第二种方式，直接在int后面加一个空的字符串，因为在java里面，默认任务int类型和字符串类型相加，为字符串类型。
//int i=2；
//String s=i+"";
//第三种方式：使用int的封装类Integer，在Integer里面用他的toString方法。
//int i=3；
//String s=Integer.toString(i);
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person();
		p.age=10;
		System.out.println(p.getAge());
		
	}

}

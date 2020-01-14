package com.atgugui.java;
/*
 * 新特性： 可变个数形参的方法。
 * 1.可变形参的格式：数据类型...变量名
 * 2.当调用可变个数形参的方法时，可变个数的形参赋值时，可赋值的变量的个数为：0个、1个或者多个。
 * 3.可变个数的形参方法与同一类中其他同名方法之间构成重载。
 * 4.可变个数形参的方法与同类型参数的数组结构，不可同时出现在类的声明中。
 * 5.规定：如果方法中存在可变个数形参，要求可变个数的形参声明在方法形参的最后。
 * 
 * 
 * */
public class ArgsTest {
	
	public static void main(String[] args) {
		ArgsTest at=new ArgsTest();
		at.method(1);
	}
	
	public void method(int num,String ... strs){
		
		System.out.println("可变形参与普通参数的搭配。");
	}
	
	public int method(String bt){
		
		if (bt ==null){
			
			return 1;
		}
		else
			return 0;	
	}

}

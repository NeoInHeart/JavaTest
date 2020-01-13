package com.atguigu.java;
/*
 * 成员变量 与 局部变量
 * 相同点：
 * 1. 声明变量的结构：数据类型 变量名=变量值。
 * 2.先声明，后使用
 * 3.都有对应的作用域
 * 
 * 不同点：
 * 1.类中声明的位置不同
 * 成员变量：直接声明在类中
 * 局部变量：方法的形参、方法的内部、构造器的内部、构造器的形参、代码块的内部...
 * 
 * 2.权限修饰器的使用
 * 成员变量声明前，可以使用权限修饰符进行修饰。而局部变量不可以使用。
 * 常见的权限修饰符有：public\private
 * 
 * 3.内存中加载的位置不同
 *  局部变量，声明在栈空间中
 *  成员变量，声明在堆空间中
 * */
public class UserTest {
	public static void main(String[] args){
		User p1=new User();
		System.out.println("用户的基本信息为： "+p1.name);
		
	}

}
class User{
	public String name="小明";
	int age=1;
	char sex;
	private int UserNum;
	
	public void UserTest(){
		System.out.println("start to eatting");
		
	}
}
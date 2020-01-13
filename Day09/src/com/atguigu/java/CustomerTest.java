package com.atguigu.java;
/*
 * 类中方法的声明与使用
 * public void show(){}
 * public void getAge(){}
 * public void showNation(){}
 * public String eat(String food){}
 * 
 * 1.方法声明的格式
 * 权限修饰符  返回值类型 方法名（形参列表）{
 * 		//方法体
 * }
 * 
 * 2.细节说明：
 * 2.1 权限修饰符：指明所修饰的结构可被调用的范围的大小。
 * 2.2
 * 
 * 3.定义方法的基本要求：
 * 3.1体现声明方法需要的几个部分。
 * 3.2体现有返回值和无返回值的情况。
 * 3.3体现有参数和无参数的情况。
 * public 返回值类型   起方法名(参数类型1,形参1；参数类型2，形参2；...){
 * 		return(当返回类型有值时，需要写上)
 * 
 * 
 * }
 * */
public class CustomerTest {
	public static void main(String[] args){
		
		
	}
}
class Customer{
	
	String name="小张";
	int age;
	
	public void show(){
		
		System.out.println("显示内容");
	}
}
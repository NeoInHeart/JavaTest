/**
 * 
 */
package com.atguigu.exer;

/**
 * @author liang  qiang
 * @version 2020年1月17日 下午3:05:28
 */
/*
 * 查看方法内的变量是哪个，需要就近原则。
 * 
 * super.方法  必须指明的情况
 * 当在子类中需要调用父类“被重写”的方法时，需要加上super.
 * 
 */
public class SuperTest1 {
	public static void main(String[] args) {
		Son son =new Son();
		son.showInfo();
	}	
}

class Father{
	protected String name="Big Java";	
}

class Son extends Father{
	String name="litite java";
	
	public Son(){
		super();
		
	}
	public void showInfo(){
		System.out.println("父类的属性值： "+super.name);
		System.out.println("子类的属性值： "+this.name);
		System.out.println("局部的属性值： "+name);
	}
}

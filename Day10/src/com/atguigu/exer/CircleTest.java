package com.atguigu.exer;

/*
 * 计算一个圆的面积，设计类方法。
 * */
public class CircleTest {
	public static void main(String[] args) {
		System.out.println("输出圆的面积: ");
		Circle c1=new Circle();
		c1.radius=3.4;
		double TheArea=c1.GetArea();
		System.out.println(TheArea);
		
	}

}

class Circle{
	
	double radius;//半径
	
	//求圆的面积
	public double GetArea(){
		return Math.PI*radius*radius;
	}
	
	
}

/**
 * 
 */
package com.atguigu.polymorphism;

public class Cricle extends Graphic{
	private double radius;
	
	
	public Cricle(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea(){
		System.out.println("输出的圆形的面积 :");
		return (Math.PI*radius*radius);
	}
		
}
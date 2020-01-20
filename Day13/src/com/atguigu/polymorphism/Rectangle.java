/**
 * 
 */
package com.atguigu.polymorphism;

class Rectangle extends Graphic{
	
	private double length;

	public Rectangle(double length) {
		super();
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea(){
		System.out.println("输出矩形的面积  :");
		return (Math.sqrt(length));
	}	
}
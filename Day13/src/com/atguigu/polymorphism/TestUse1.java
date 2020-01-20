/**
 * 
 */
package com.atguigu.polymorphism;

/**
 * @author liang  qiang
 * @version 2020年1月19日 上午9:48:23
 */
/*
 * 多态的应用
 * 
 * 需求：
 * (1)父类，图形Graphic,里面有一个方法getArea()
 * 
 * 运用数组的形式去存储各类图形方式。
 */
public class TestUse1 {
	public static void main(String[] args) {
		Graphic[] g=new Graphic[2];
		g[0]=new Cricle(20);
		g[1]=new Rectangle(100);
		for (int i = 0; i < g.length; i++) {
			g[i].getArea();
		}
	}
}

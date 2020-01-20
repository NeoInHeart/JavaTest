/**
 * 
 */
package com.atguigu.polymorphism;

/**
 * @author liang  qiang
 * @version 2020年1月19日 上午10:29:59
 */
/*
 * 需求：在工具类GraphicTools中，声明一个方法、功能,可能比较两个图形对象的面积是否相同。
 */

public class TestUse2 {

}
class GraphicTools{
	
	 public boolean Compares(Graphic g1,Graphic g2){
		 return (g1.getArea()>g2.getArea())?true:false;	 
	 }
}

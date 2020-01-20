/**
 * 
 */
package com.atguigu.exer;

/**
 * @author liang  qiang
 * @version 2020年1月17日 上午11:47:25
 */
/**
 * 方法重写的要求：
 * 	(1)子类重写的方法方法名必须与父类中待重写的方法相同
 * 	(2)子类重写的方法的形参列表必须与父类被重写的方法的形参列表相同
 * 	(3)子类重写的方法的返回值类型与父类被重写的方法值类型的关系
 * 3.1 如果返回值类型是void或者基本的数据类型。
 * 3.2 如果返回值类型是引用数据类型，可以<=的关系 子类重写的方法的返回值类型<=父类重写的方法的返回值类型
 *     子类的范围要小于父类的范围
 *   (4)子类重写的方法的权限修饰符 >= 父类被重写的方法的权限修饰符。
 * 
 */
public class TestOverride {
	

}
class ClassA{
	
	public ClassA(){	
	}
	

	protected void show(){
		
	}
	
}
class ClassB extends ClassA{
	
	public ClassB(){	
	}
	
	@Override
	//表示对上级类的方法的重载
	protected void show(){
		
	}
}

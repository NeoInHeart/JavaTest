/**
 * 
 */
package com.atguigu.exer;

/**
 * @author liang  qiang
 * @version 2020年1月17日 上午10:18:54
 * 
 */
/*
 * 继承的特点：
 * 	(1)子类不会继承父类的构造器，但是在子类的构造器中一定会调用父类的构造器
 * 	(2)子类可继承父类的所有方法、属性，但是父类中的关于这个方法或者属性是私有化的，子类中不能直接使用。
 * 	(3)子类可以扩展父类没有的属性
 * 	(4)如果父类的方法不适应与子类，可选择在子类内重构此种方法。
 * 	(5)java中继承有单继承的限制
 * 一个子类中只有一个直接父类
 * 	(6)java支持多层继承。
 * public class Manager extends Employee
 * public class Employee extends Person
 */
public class ExerTest {
	public static void main(String[] args) {
		//创建Person对象
		
		Person person=new Person("张三",23);
		System.out.println(person.getInfo());
		
		//创建员工对象
		Employee e=new Employee("李四",25,12345);
		System.out.println(e.getInfo());
		
		//创建管理者对象
		Manager ma=new Manager("王五",25,123456,2000);
		System.out.println(ma.getInfo());
		
	}

}

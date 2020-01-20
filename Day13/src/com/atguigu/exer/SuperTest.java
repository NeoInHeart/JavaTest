/**
 * 
 */
package com.atguigu.exer;

/**
 * @author liang  qiang
 * @version 2020年1月17日 下午2:13:43
 */
/*
 * 回忆：this 
 * 意思表示当前对象
 * (1) 构造器中正在创建的那个对象
 * (2) 在方法中，当前对象表示调用的这个方法的对象
 * 
 * super父类的
 * 要求通过super访问的属性、方法、构造器必须是在子类中可见的 。
 * 不能说private
 */
public class SuperTest {
	public static void main(String[] args) {
		Animal a =new Animal();
		Dog d =new Dog(4,"京巴狗");
		System.out.println(d.getInfo());
	}

}
class Animal{
	private int age;

	public Animal() {
		super();
	}

	public Animal(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	protected String getInfo(){
		return "The Animal age is "+this.age;
	}
		
}

class Dog extends Animal{
	private String name;
	
	public Dog(int age, String name) {
		super(age);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}

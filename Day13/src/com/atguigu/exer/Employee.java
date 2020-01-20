/**
 * 
 */
package com.atguigu.exer;

/**
 * @author liang  qiang
 * @version 2020年1月17日 上午9:44:45
 */
public class Employee extends Person {
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getInfo(){
		return "姓名："+getName()+" 年龄: "+getAge();
	}
	
	

}

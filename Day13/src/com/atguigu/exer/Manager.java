/**
 * 
 */
package com.atguigu.exer;

/**
 * @author liang  qiang
 * @version 2020年1月17日 上午10:00:04
 */
/*
 * 管理者类Manager，继承员工类，有奖金属性
 */
public class Manager extends Employee {
	private int bonus;

	public Manager() {
		super();
	}

	public Manager(String name, int age, double salary, int bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String getInfo(){
		
		return ("姓名："+getName()+" 年龄： "+getAge()+" 薪资： "+getSalary()+" 奖金 ："+bonus);
	}
	
	

}

package com.atguigu.java;

public class Boy {
	private String name;
	private int  age;
	
	public String getName(){
		
		return this.name;
	}
	public Boy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		
		this.name=name;
	}
	
	public int  getAge(){
		
		return this.age;
	}
	public void setAge(int age){
		
		this.age=age;
	}
	
	public void show(){
		
		System.out.println("name: "+name+"age: "+age);
	}
	
	public void Marry(Girl girl){
		
		if(girl.getAge()>20 && girl.getAge()<=60){
			System.out.println("可以结婚啦");
			System.out.println(girl.getName());
		}
		else{
			System.out.println("还是在等等吧。");
		}		
	}

}

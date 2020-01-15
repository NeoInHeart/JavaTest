package com.atguigu.java;

public class Girl {
	private String name;
	private int  age;
	
	public Girl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName(){
		
		return this.name;
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
	public void Compare(Girl girl1,Girl girl2){
		if (girl1.getAge()>girl2.getAge()){
			System.out.println(girl1.getName()+"的年龄较大");
		}
		else{
			System.out.println(girl2.getName()+"的年龄较大");
			
		}		
	}
	public int Compare(Girl girl){
		
		if (this.age>girl.age){
			return 1;
		}
		else if (this.age<girl.age){
			return -1;
		}else{
			return 0;
		}
	}


}

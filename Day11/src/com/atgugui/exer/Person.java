package com.atgugui.exer;

public class Person {
	public String  name;
	public  int age;
	
	public String getAge(){
		if (age<0||age>120){
			return  "输入信息有误。";
		}
		else{
			
			return Integer.toString(age);
		}
		
	}

}

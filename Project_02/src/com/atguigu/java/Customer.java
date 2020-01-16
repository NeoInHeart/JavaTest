package com.atguigu.java;

public class Customer {
	private String name;
	private char gender;
	private int age;
	private String phone;
	private String email;
	
	
	
	public Customer() {
	}
	
	
	public Customer(String name, char gender, int age, String phone, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 输出基本的信息
	 * @return
	 */
	public String info(){
		return ('\t'+this.getName()+'\t'+this.getGender()+
				'\t'+this.getAge()+'\t'+this.getPhone()+'\t'+this.getEmail());
	}
	
	
	

}

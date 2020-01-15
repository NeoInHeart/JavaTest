package com.atguigu.java;
/*
 * CustomerList为Customer对象的管理模块，内部使用数组管理一组Customer对象
 * 主要用于处理业务
 */
public class CustomerList {
	private Customer[] customers;//保存客户对于像的数组
	private int total=0;//记录已保存客户对象的数量。
	
	/**
	 * CustomerList的构造器
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer){
		customers=new Customer[totalCustomer];
	}
	
	
	public boolean addCustomer(Customer customer){
		if (total>=customers.length){
			return false;
		}
		customers[total++]=customer;
		return true;
	}
	
	
	public boolean replaceCustomer(int index,Customer cust){
		return false;
	}
	
	public boolean deleteCustomer(int index){
		return false;
	}
	
	public Customer[] getAllCustomers(){
		
		return customers;
	}
	
	public Customer[] getCustomers(int index) {
		return customers;
	}
	
	public int getTotal(){
		
		return 1;
	}
			
}

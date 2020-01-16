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
	
	/**
	 * 更换指定位置上的索引的对象
	 * @param index //要替换的所在索引位置
	 * @param cust  //要替换的索引的客户信息
	 * @return
	 */
	public boolean replaceCustomer(int index,Customer cust){
		if(index<0||index>=total){
			return false;	
		}
		customers[index]=cust;
		return true;
	}
	
	/**
	 * 删除指定索引位置上的元素
	 * @param index 要删除的索引的位置
	 * @return 删除是否成功
	 */
	public boolean deleteCustomer(int index){
		if(index<0||index>=total){
			return false;	
		}
		else{
			for (int i=index;i<total-1;i++){
				customers[index]=customers[index+1];
			}
			customers[--total]=null;
			return true;
		}
	}
	
	/**
	 * 返回所有客户构成的数组
	 *  @return
	 */
	public Customer[] getAllCustomers(){
		Customer[] custs=new Customer[total];
		for (int i=0;i<custs.length;i++){
			custs[i]=customers[i];	
		}
		return custs;
	}
	
	/**
	 * 返回索引位置上的客户
	 * @param index
	 * @return
	 */
	public Customer getCustomers(int index) {
		if (index<0 ||index>total){
			return null;
		}
		Customer cust=new Customer();
		cust=customers[index];
		return cust;
	}
	
	/**
	 * 返回存储客户的数量
	 * @return
	 */
	public int getTotal(){		
		return total;
	}
			
}

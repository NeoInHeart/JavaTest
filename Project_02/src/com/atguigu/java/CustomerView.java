/**
 * 
 */
package com.atguigu.java;

/**
 * CustomerView为主模块， 主要负责菜单的显示和处理用户操作
 * @author  liang qiang
 * @version 2020年1月16日 上午9:41:41
 */
import java.util.*;
public class CustomerView {
	 private CustomerList customerList=new CustomerList(10);
	/**
	 * 显示主界面操作
	 */
	public void enterMainMenu(){
		boolean isFlag=true;
		while(isFlag){
			System.out.println("--------客户信息管理软件--------");
			System.out.println();
			System.out.println("\t"+"1.增加客户信息"+"\t");
			System.out.println("\t"+"2.修改客户信息"+"\t");
			System.out.println("\t"+"3.删除客户信息"+"\t");
			System.out.println("\t"+"4.查看客户列表"+"\t");
			System.out.println("\t"+"5. 退           出"+"\t");
			System.out.println("请选择1-5选项(0为退出键)："+"\t");
			char menu=CMUtility.readMenuSelection();
			switch(menu){
			
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomer();
				break;
			case '5':
				System.out.println("确认是否退出程序？(Y/N)");
				char isExit=CMUtility.readConfirmSelection();
				if(isExit=='Y'){
					isFlag=false;
					System.out.println("程序退出成功。");
				}else{
					
					System.out.println("请继续程序选择。");
				}				
				break;
			
			
			}
		}		 				
	}
	/**
	 * 增加客户的操作
	 */
	private void addNewCustomer(){
		System.out.println("---------增加客户---------");
		System.out.println("姓名：");
		String name = CMUtility.readString(10);
		System.out.println("性别：");
		char gender = CMUtility.readChar();
		System.out.println("年龄：");
		int age = CMUtility.readInt();
		System.out.println("电话：");
		String phone = CMUtility.readString(11);
		System.out.println("邮箱：");
		String email = CMUtility.readString(25);
		//将数据封装在一个Customer对象内进行读取操作	
		Customer cust=new Customer(name,gender,age,phone,email);
		boolean addSuccess =customerList.addCustomer(cust);
		if (addSuccess){
			System.out.println("------添加成功-----");
		}
		else{
			System.out.println("------添加失败-----");
		}
	}
	/**
	 * 修改客户的操作
	 */
	private void modifyCustomer(){
		System.out.println("----------修改客户----------");
		Customer cust;
		int number;
		while(true){
			System.out.println("请选择要修改的客户编号(-1退出)：");
			number = CMUtility.readInt();
			if(number==-1){	
				return;
			}
			cust=customerList.getCustomers(number-1);//客户编号从1开始
			if(cust == null){
				System.out.println("无法找到指定客户！");
			}else{
				
				break;
			}				
		}
		//开始修改的操作。
		System.out.print("姓名("+cust.getName()+"):");
		String name = CMUtility.readString(10,cust.getName());
		System.out.print("性别("+cust.getGender()+"):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄("+cust.getAge()+"):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话("+cust.getPhone()+"):");
		String phone = CMUtility.readString(11,cust.getPhone());
		System.out.print("邮箱("+cust.getEmail()+"):");
		String email = CMUtility.readString(25,cust.getEmail());
		Customer cust1=new Customer(name,gender,age,phone,email);
		System.out.println(cust1.info());
		boolean replaceSuccess =customerList.replaceCustomer(number-1, cust1);
		if (replaceSuccess){
			System.out.println("------修改成功-----");
		}
		else{
			System.out.println("------修改失败-----");
		}
		
	}
	/**
	 * 删除客户的操作
	 */
	private void deleteCustomer(){
		System.out.println("---------删除客户--------");
		Customer cust;
		int number;
		while(true){
			System.out.println("请选择要删除的客户编号(-1退出)：");
			number = CMUtility.readInt();
			if(number==-1){	
				return;
			}
			cust=customerList.getCustomers(number-1);//客户编号从1开始
			if(cust == null){
				System.out.println("无法找到指定客户！");
			}else{
				break;
			}				
		}
		
		System.out.println("是否确认删除(Y/N)：");
		char ConfirmDelete = CMUtility.readConfirmSelection();
		if(ConfirmDelete=='Y'){
			boolean deleteSuccess = customerList.deleteCustomer(number-1);
			if (deleteSuccess){
				System.out.println("------删除成功-----");
			}
			else{
				System.out.println("------删除失败-----");
			}
			
		}	
	}
	/**
	 * 显示所有客户的操作
	 */
	private void listAllCustomer(){
		System.out.println("---------显示客户列表完成---------");
		int total =customerList.getTotal();
		if (total==0){
			System.out.println("没有客户记录");
		}else{
			
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
			Customer[] custs=customerList.getAllCustomers();
			for (int i=0;i<custs.length;i++){
				Customer cust=custs[i];
				System.out.println((i+1)+cust.info());
			}
		}
		
		
		System.out.println("---------显示客户列表完成---------");
		
	}
	public static void main(String[] args) {
		CustomerView customerview =new CustomerView();
		customerview.enterMainMenu();
		
		
		
	}

}

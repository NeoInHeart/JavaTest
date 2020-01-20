/**
 * 
 */
package com.atguigu.exer1;

/**
 * @author liang qiang
 * @version 2020年1月17日 下午3:58:23
 */
public class AccountTest {
	public static void main(String[] args) {
		Account ac =new Account("123456", 2000, 0.15);
		ac.deposit(200);
		System.out.println("当前余额: "+ac.getBalance());
		ac.withdraw(500);
		System.out.println("当前余额: "+ac.getBalance());
		System.out.println("当前月利率： "+ac.getMonthlyInterest()+"%");
	}
	

}

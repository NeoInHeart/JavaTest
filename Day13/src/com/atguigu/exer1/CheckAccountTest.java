/**
 * 
 */
package com.atguigu.exer1;

/**
 * @author liang  qiang
 * @version 2020年1月17日 下午4:37:03
 */
public class CheckAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CheckAccount ca=new CheckAccount("123", 2500, 0.15, 500);
		ca.deposit(200);
		System.out.println("当前余额： "+ca.getBalance());
		System.out.println("当前信用额度： "+ca.getOverdraft());
		System.out.println(ca.withdraw(2800));

	}

}

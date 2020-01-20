/**
 * 
 */
package com.atguigu.exer1;

/**
 * @author liang  qiang
 * @version 2020年1月17日 下午3:35:14
 */
public class Account {
	private String id;
	private double balance;
	private double annualInterestRate;
	
	public Account(String id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//返回月利率的方法getMonthlyInterest() 
	public double getMonthlyInterest(){
		return annualInterestRate/12*100;
	}
	
	//取款的方法 withdraw()
	public boolean withdraw(double amount){
		if(this.balance>amount){
			this.balance-=amount;
			return true;
		}else{
			System.out.println("余额不足");
			return false;
		}	
	}
	
	//存款的方法deposit()
	public boolean deposit(double amount){
		if (amount>0){
			this.balance+=amount;
		}
		return true;
	}
	
	
	
	

}

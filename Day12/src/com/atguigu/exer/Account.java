package com.atguigu.exer;

public class Account {
	private int id;
	private double balance;
	private double annualinterestRate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualinterestRate() {
		return annualinterestRate;
	}
	public void setAnnualinterestRate(double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
	}
	public Account(int id, double balance, double annualinterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualinterestRate = annualinterestRate;
	}
	/**取钱
	 * 
	 * @param amount
	 */
	public void withdraw(double amount){
		if(this.balance>amount){
			this.balance-=amount;
		}else{
			System.out.println("余额不足");
		}
	}
	
	/**存钱
	 * 
	 * @param amount
	 */
	
	public void deposit(double amount){
		if (amount>0){
			this.balance+=amount;
		}
	}
	
	public void showMessage(){
		System.out.println("the account id is : "+this.id+" the account balance is :"+
	this.balance+"  and the annualinterestRate is :"+this.annualinterestRate*100+"%");
		
		
	}

}

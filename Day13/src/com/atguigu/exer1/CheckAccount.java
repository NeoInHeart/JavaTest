package com.atguigu.exer1;

public class CheckAccount extends Account {
	private double overdraft;

	public CheckAccount(String id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
		this.overdraft=overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<=getBalance()){
			setBalance(getBalance()-amount);
			return true;
		}else if (amount >getBalance() && overdraft>=amount-getBalance()){
			this.overdraft-=(amount-getBalance());
			super.setBalance(0.0);
			return true;
		}else{
			System.out.println("超过透支余额");
			return false;
		}
	
	}
	

}

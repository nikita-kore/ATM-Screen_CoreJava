package com.demo.atm;

// POGO ClASS

public class ATM {

	private double balance;
	private double deposidtAmount;
	private double withdrawAmount;

	// DEFAULT CONSTRUCTOR
	
	public ATM() {
		super();
	}

	// PARAMTERIZED CONSTURUCTOR
	
	public ATM(double balance, double deposidtAmount, double withdrawAmount) {
		super();
		this.balance = balance;
		this.deposidtAmount = deposidtAmount;
		this.withdrawAmount = withdrawAmount;
	}

	//GETTER SETTER

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposidtAmount() {
		return deposidtAmount;
	}

	public void setDeposidtAmount(double deposidtAmount) {
		this.deposidtAmount = deposidtAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	// TO STRING

	@Override
	public String toString() {
		return "ATM [balance=" + balance + ", deposidtAmount=" + deposidtAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}

}

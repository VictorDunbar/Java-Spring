package com.codingdojo.bankaccount;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {
	protected String acctNum;
	private double checking;
	private double savings;
	static int numOfAccts;
	static ArrayList<BankAccount> acctList = new ArrayList<BankAccount>();
	static int totalMoney = 0;
	
	public BankAccount(double checking, double savings) {
		this.acctNum = randomAcctNum();
		this.checking = checking;
		this.savings = savings;
		acctList.add(this);
		numOfAccts++;
		
	}
	public String randomAcctNum() {
		String random = "";
		for(int i = 0; i < 10; i ++) {
			random += ThreadLocalRandom.current().nextInt(0, 9);
		}
		return random;
	}
	//Getters and setters
	public double getChecking() {
		return this.checking;
	}
	
	public double getSavings() {
		return this.savings;
	}
	public void depositMoney(double amt, char acct) {
		if(acct =='c' || acct == 'C') {
			this.checking += amt;
			System.out.println("Checking Balance: $" + this.checking);
		}
		else if(acct == 's' || acct == 'S') {
			this.savings += amt;
			System.out.println("Savings balance: $" + this.savings);
		}
		else {System.out.println("Deposit into s for Savings or c for Checking");
	
		}
	}
	public void withdraw(double amt) {
		if(this.checking < amt) {
			System.out.println("Not enough funds for this transaction.");
		}
		else {
			this.checking -= amt;
			System.out.println("Withdrew $" + amt + " from Checking account. New balance is: $" + this.checking);
		}
	}
	public void totalAmts() {
		double totalChecking = 0;
		double totalSavings = 0;
		for(BankAccount ba: acctList) {
			totalChecking = ba.checking;
			totalSavings = ba.savings;
			
			System.out.println("Total amount in Checking accounts:  $" + totalChecking);
			System.out.println("Total amount in Savings accounts: $" + totalSavings);
		}
	}
}	




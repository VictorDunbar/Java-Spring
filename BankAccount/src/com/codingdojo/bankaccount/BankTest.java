package com.codingdojo.bankaccount;

public class BankTest {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(3421.45, 5400);
		BankAccount ba2 = new BankAccount(2305.65, 1500);
		BankAccount ba3 = new BankAccount(567.03, 750);
		
		
		ba3.totalAmts();
		
		
		ba1.withdraw(4000);
		ba2.withdraw(550);
		ba3.depositMoney(7500, 'c');
		
		
	}
}
	
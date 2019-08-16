package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1= new BankAccount();
		System.out.println(account1.getAccount_num());
		System.out.println(account1.getChecking_balance());
		System.out.println(account1.getSavings_balance());
		System.out.println(BankAccount.getNumOfAccounts());
		System.out.println(BankAccount.getTotalMoneyStored());
		account1.depositToChecking(3000);
		account1.depositToSavings(2000);
		System.out.println(BankAccount.getTotalMoneyStored());
		account1.viewCheckingAndSavings();
		account1.withdrawFromChecking(1000);
		account1.withdrawFromSavings(3000);
		account1.viewCheckingAndSavings();
		System.out.println(BankAccount.getTotalMoneyStored());
	}

}

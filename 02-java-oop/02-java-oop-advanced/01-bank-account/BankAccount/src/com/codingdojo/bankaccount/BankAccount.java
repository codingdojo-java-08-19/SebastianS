package com.codingdojo.bankaccount;
import java.util.Random;

public class BankAccount {
	private String account_num;
	private double checking_balance=0.0;
	private double savings_balance=0.0;
	private static int numOfAccounts=0;
	private static double totalMoneyStored=0.0;
	
	
	public BankAccount() {
		this.setAccount_num(randomTenDigitNum());
		numOfAccounts++;
	}
	
	public void depositToChecking(double deposit) {
		this.setChecking_balance(deposit+this.getChecking_balance());
		totalMoneyStored+=deposit;
	}
	public void depositToSavings(double deposit) {
		this.setSavings_balance(deposit+this.getSavings_balance());
		totalMoneyStored+=deposit;
	}
	
	public void withdrawFromSavings(double withdrawal) {
		if (this.getSavings_balance()-withdrawal<0) {
			System.out.println("You do not have sufficient funds.");
			return;
		}
		else {
			this.setSavings_balance(this.getSavings_balance()-withdrawal);
		}
		totalMoneyStored-=withdrawal;
	}
	public void withdrawFromChecking(double withdrawal) {
		if (this.getChecking_balance()-withdrawal<0) {
			System.out.println("You do not have sufficient funds.");
			return;
		}
		else {
			this.setChecking_balance(this.getChecking_balance()-withdrawal);
		}
		totalMoneyStored-=withdrawal;
	}
	public void viewCheckingAndSavings() {
		System.out.println("Checkings: $"+ this.getChecking_balance()+ " Savings: $"+ this.getSavings_balance());
	}
	
	private String randomTenDigitNum() {
		Random r = new Random();
		String randNum= String.valueOf(r.nextInt(900000000)+1000000000);
		return randNum;
	}

	public String getAccount_num() {
		return account_num;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public double getChecking_balance() {
		return checking_balance;
	}

	public void setChecking_balance(double checking_balance) {
		this.checking_balance = checking_balance;
	}

	public double getSavings_balance() {
		return savings_balance;
	}

	public void setSavings_balance(double savings_balance) {
		this.savings_balance = savings_balance;
	}

	public static int getNumOfAccounts() {
		return numOfAccounts;
	}

	public static void setNumOfAccounts(int numOfAccounts) {
		BankAccount.numOfAccounts = numOfAccounts;
	}

	public static double getTotalMoneyStored() {
		return totalMoneyStored;
	}

	public static void setTotalMoneyStored(double totalMoneyStored) {
		BankAccount.totalMoneyStored = totalMoneyStored;
	}
	
	
	
}

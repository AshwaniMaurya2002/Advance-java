package com.qspider.rbi.yourbank;

import com.qspider.sbi.mybank.MyBank;

public class YourBank {
	
	public static void main(String[] args) {
		System.out.println("Welcome to YourBank");
		
		MyBank myBank = new MyBank();
		myBank.deposit();
		int i = myBank.returnInt();
		System.out.println("Value of i is: "+i);
		int sum = myBank.add(10, 20);
		System.out.println("Sum is: "+sum);
		
	}

}

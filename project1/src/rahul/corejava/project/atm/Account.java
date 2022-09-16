package rahul.corejava.project.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkBalance=0;
	private double savingBalance=0;
	
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	private double checkingBalance;
	private double savingingBalance;
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}

	public double getCheckBalance() {
		return checkBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}

	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance-amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingingBalance-amount);
		return savingBalance;
	}
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance+amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingingBalance+amount);
		return savingBalance;
	}


	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat(checkingBalance));
		System.out.println("Amount you want to withdraw from checking Account: ");
		double amount=input.nextDouble();
		
		if((checkingBalance-amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
			
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	private String moneyFormat(double checkingBalance2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void getsavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving Account: ");
		double amount=input.nextDouble();
		
		if((savingBalance-amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
			
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking Account: ");
		double amount=input.nextDouble();
		
		if((checkingBalance+amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
			
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit from saving Account: ");
		double amount=input.nextDouble();
		
		if((savingBalance+amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
			
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
}

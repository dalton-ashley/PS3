package base;

import java.util.Date;

public class Account {
	
	/** Define Variables*/
	private int id; 
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	/** No-arg constructor*/
	Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}

	public Account(int id, double balance){
			this.id = id;
			this.balance = balance;
		}

	/** Access Modifiers*/
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

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	/** Monthly Interest*/
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	/** Withdraw */
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount <= balance){
			balance -= amount;
		}
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	/** Deposit */
	public void deposit (double amount){
		balance += amount;
	}
}

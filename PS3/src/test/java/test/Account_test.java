package test;

import base.Account;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Account_test extends TestCase {
	
	Account account;
	
	@Before
	public void setUpBeforeClass() throws Exception{
		
		account = new Account(1122,20000);
	}
	
	@After
	public void tearDown() throws Exception{
		account = null;
	}
	
	@Test
	public void main(String[] args) throws Exception{
	
		account.withdraw(2500);
		account.withdraw(25000);
		account.deposit(3000);
		System.out.println("Your Balance is" + account.getBalance());
		System.out.println("Your Monthly Interest is" + account.getMonthlyInterestRate());
		System.out.println("Your Account was Created at" + account.getDateCreated());
	}	
}


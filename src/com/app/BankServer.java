package com.app;

import com.pojo.User;

public interface BankServer {

	public int getBalance(User u);
	
	//Return updated balance
	public int withdraw(User u, int ammount);
	
	//What if ammount is not available
	public int deposite (User u, int ammount);
	
	public void createAccount(User u);
	
}

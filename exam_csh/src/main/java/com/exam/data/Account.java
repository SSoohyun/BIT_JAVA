package com.exam.data;

public class Account {
	private String accountId;
	private String accountPwd;
	private String userName;
	private int balance;
	
	public Account() {}
	
	public Account(String accountId, String accountPwd, String userName, int balance) {
		super();
		this.accountId = accountId;
		this.accountPwd = accountPwd;
		this.userName = userName;
		this.balance = balance;
	}
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountPwd() {
		return accountPwd;
	}
	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

package com.tan.Interface.java;

public interface ATM {
	public boolean withdraw(int account, double money);//rut tien
	public boolean deposit(int account, double money);//nap tien
	public double queryBalance(int account);//so du
	public boolean login(String usename, String password);//dang nhap
	public boolean logout(String usename);//dang xuat
	
}

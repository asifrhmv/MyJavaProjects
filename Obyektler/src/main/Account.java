package main;

public class Account {
private String accountHolder;
private String accountNumber;
private double balance;
private String currency;
Account(String accountHolder,String accountNumber,double balance,String currency){
	this.accountHolder=accountHolder;
	this.accountNumber=accountNumber;
	if(balance<0) {
		System.out.println("Balans menfi ola bilmez !");
		this.balance=0;
	}
	else {
		this.balance=balance;
	}
	if(currency!="AZN" && currency!="USD"&& currency!="EUR"){
		System.out.println("Valyutani duzgun sechin !");
		this.currency="AZN";
	}
	else {
		this.currency=currency;
	}
}

public void displayAccount() {
	System.out.println("Hesab sahibi:"+this.accountHolder);
	System.out.println("Hesab nomresi:"+this.accountNumber);
	System.out.println("Balans:"+this.balance);
	System.out.println("Valyuta:"+this.currency);
	System.out.println("----------------------");
}

public String getAccountHolder() {
	return this.accountHolder;
}
public void setAccountHolder(String newHolder) {
	this.accountHolder=newHolder;
}


public String getAccountNumber() {
	return this.accountNumber;
}

public void setAccountNumber(String newNumber) {
	this.accountNumber=newNumber;
}

public String getCurrency() {
	return currency;
}

public void setCurrency(String newCurrency) {
if (newCurrency!="AZN" && newCurrency!="USD"&& newCurrency!="EUR") {
	System.out.println("Valyutani duzgun daxil edin !");
	this.currency="AZN";
}
else {
this.currency=newCurrency;
}
}

public double getBalance() {
	return balance;
}

public void setBalance(double newBalance) {
	if(newBalance<0) {
		System.out.println("Balans menfi ola bilmez !");
		this.balance=0;
	}
	else {
		this.balance = newBalance;
	}
}










}

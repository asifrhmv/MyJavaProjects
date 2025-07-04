package main;

public abstract class BankCard {
private String cardNumber;
private double balance;

BankCard(String cardNumber,double balance){
	this.cardNumber=cardNumber;
	this.balance=balance;
}

public abstract String getCardType();

public double deposit(double amount) {
	return balance+=amount;
}

public abstract double withdraw(double amount);

public double getBalance() {
	return this.balance;
}

public void setBalance(double newBalance) {
	this.balance=newBalance;
}


}

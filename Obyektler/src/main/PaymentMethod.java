package main;

public  abstract class PaymentMethod {
private String accountHolder;
private double balance;

PaymentMethod(String accountHolder,double balance){
	this.accountHolder=accountHolder;
	this.balance=balance;
}

public double getBalance() {
	return this.balance;
}

public void setBalance(double newBalance) {
	this.balance=newBalance;
}

public double deposit(double amount) {
	this.setBalance(this.getBalance()+amount);
	return this.getBalance();
}

public abstract double withdraw(double amount);


public abstract String getPaymentType();

}

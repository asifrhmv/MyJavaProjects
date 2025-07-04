package main;

public class CreditCard extends BankCard{
	
	CreditCard(String cardNumber,double balance){
		super(cardNumber, balance);
	}

	public String getCardType() {
		return "Credit card";
	}
	public double deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
		return this.getBalance();
	}
	
	public double withdraw(double amount) {
		double newBalance=this.getBalance()-amount;
		if(newBalance< -1000) {
			System.out.println("Limit 1000 azndir !");
			return this.getBalance();
		}
		else {
			 this.setBalance(newBalance);
			return newBalance;
		}
	}
	
	
	
}

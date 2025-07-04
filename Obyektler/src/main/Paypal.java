package main;

public class Paypal extends PaymentMethod{
	Paypal(String accountHolder,double balance){
		super(accountHolder, balance);
	}

	public String getPaymentType() {
		return "Paypal";
	}
	public double withdraw(double amount) {
		double newBalance=this.getBalance()-amount;
		if(newBalance<10) {
			System.out.println("Balansda minimum 10 azn qalmalidir !");
			return this.getBalance();
		}
		else {
			this.setBalance(newBalance);
			return this.getBalance();
		}
	}
	
	
}

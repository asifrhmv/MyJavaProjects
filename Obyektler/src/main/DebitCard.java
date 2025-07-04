package main;

public class DebitCard extends BankCard{
	
	
	DebitCard(String cardNumber,double balance){
		super(cardNumber, balance);
	}
	public String getCardType() {
		return "Debit Card";
	}

	public double deposit(double amount) {
		 this.setBalance(this.getBalance()+amount);
		 return this.getBalance();
	}
	
	public double withdraw(double amount) {
		if(amount>this.getBalance()) {
       System.out.println( "Balansdan artiq mebleg chixarila bilmez !");
        return this.getBalance();
		}
		else {
			this.setBalance(this.getBalance()-amount);
			return this.getBalance();
		}
	}
}

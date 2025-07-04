package main;

public class MobileWallet extends PaymentMethod {
	
	MobileWallet(String accountHolder,double balance){
		super(accountHolder, balance);
	}
	
	public String getPaymentType() {
		return "Mobile Wallet";
	}
	
	public double withdraw(double amount) {
		if(amount>100) {
			System.out.println("Maksimum chixarish 100 azndir !");
			return this.getBalance();
		}
		else {
			this.setBalance(this.getBalance()-amount);
			return this.getBalance();
		}
	}

}

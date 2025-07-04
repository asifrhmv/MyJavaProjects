package main;

public class CryptoWallet extends PaymentMethod {
	
	CryptoWallet(String accountHolder,double balance){
		super(accountHolder, balance);
	}
	
	public String getPaymentType() {
		return "Crypto Wallet";
	}
	
	
	public double withdraw(double amount) {
        this.setBalance(this.getBalance()-(amount*1.02));
        	return this.getBalance();
	}

}

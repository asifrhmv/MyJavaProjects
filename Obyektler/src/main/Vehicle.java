package main;

public abstract class Vehicle {
private String brand;

Vehicle(String brand){
	this.brand=brand;
}

public abstract void displayCar();
public abstract void startEngine();

public void stopEngine() {
	System.out.println("Muherrik sonduruldu !");
}

public String getBrand() {
	return this.brand;
}

public void setBrand(String newBrand) {
	this.brand=newBrand;
}


}

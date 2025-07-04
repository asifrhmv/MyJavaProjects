package main;

public class Motorcycle extends Vehicle{
	private int engineCapacity;
	
	Motorcycle(String brand,int engineCapacity){
		super(brand);
		if(engineCapacity<0) {
			System.out.println("Muherrik hecmi menfi ola bilmez !");
			this.engineCapacity=500;
		}
		else {
			this.engineCapacity=engineCapacity;
		}
	}
	
	public void startEngine() {
		System.out.println(this.getBrand()+" "+this.engineCapacity+" "+" Muherriki ishe dushdu !");
	}

	public void displayCar() {
		System.out.println("Brend: "+this.getBrand());
		System.out.println("Muherrik hecmi: "+this.engineCapacity);
		System.out.println("---------------------------------");
	}
	
	public int getEngineCapacity() {
		return this.engineCapacity;
	}
	
	public void setEngineCapacity(int newCapacity) {
		if(newCapacity<0) {
			System.out.println("Muherrik hecmi menfi ola bilmez !");
			this.engineCapacity=500;
		}
		else {
			this.engineCapacity=newCapacity;
		}
	}
}

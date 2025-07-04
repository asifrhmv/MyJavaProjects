package main;

public class Car extends Vehicle{
	private String model;
	
	Car(String brand,String model){
		super(brand);
		this.model=model;
	}

public void startEngine() {
	System.out.println(this.getBrand()+" "+this.model+" Muherriki ishe dushdu !");
}

public void stopEngine() {
	System.out.println(this.getBrand()+" "+this.model+" Muherriki sonduruldu !");
}

public void displayCar() {
	System.out.println("Avtomobilin brendi: "+getBrand());
	System.out.println("Avtomobilin modeli: "+this.model);
	System.out.println("---------------------------------");
}

public String getModel() {
	return this.model;
}

public void setModel(String newModel) {
	this.model=newModel;
}



}

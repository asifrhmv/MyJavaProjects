package main;

public class Circle implements IShape {
private final double p=3.14;
private int radius;

Circle(int radius){
	this.radius=radius;
}

public void calculateArea() {
	System.out.println("Dairenin sahesi: "+(p*this.radius*this.radius));
}


public void calculatePerimeter() {
	System.out.println("Dairenin perimetri: "+(2*p*this.radius));
}
}

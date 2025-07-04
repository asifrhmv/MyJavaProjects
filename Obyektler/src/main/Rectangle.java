package main;

public class Rectangle implements IShape{
	
	private int length;
	private int width;
	
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	
	
public void calculateArea() {
	System.out.println("Duzbucaqlinin sahesi "+(this.length*this.width) );
}

public void calculatePerimeter() {
	System.out.println("Duzbucaqlinin perimetri: "+(2*(this.length+this.width)));
}
}

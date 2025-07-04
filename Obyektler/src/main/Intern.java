package main;

public class Intern extends Employee{
private double stipend;
	public Intern(String name, int age, double baseSalary,double stipend) {
		super(name, age, baseSalary);
		if(stipend<0) {
			System.out.println("Teqaud menfi ola bilmez !");
			this.stipend=0;
		}
		else {
			this.stipend=stipend;
		}
	}

	public double getStipend() {
		return this.stipend;
	}
	
	public void setStipend(double newStipend) {
		if(newStipend<0) {
			System.out.println("Teqaud menfi ola bilmez !");
			this.stipend=0;
		}
		else {
			this.stipend=newStipend;
		}
	}
	
	public void calculateSalary() {
		System.out.println("Intern salary with stipend:"+(baseSalary+this.stipend));
	}
	
	
}

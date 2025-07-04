package main;

public class Manager extends Employee{
private int bonus;
	Manager(String name,int age,double baseSalary,int bonus){
		super(name, age, baseSalary);
		if(bonus<0) {
			System.out.println("Bonus 0 ola bilmez !");
			this.bonus=100;
		}
		else {
			this.bonus=bonus;
		}
	}
	
	public int getBonus() {
		return this.bonus;
	}
	public void setBonus(int newBonus) {
		if(newBonus<0) {
			System.out.println("Bonus menfi ola bilmez !");
			this.bonus=100;
			
		}
		else {
			this.bonus=newBonus;
		}
	}
	
	public void calculateSalary() {
		System.out.println("Manager salary with bonuses:"+(this.baseSalary+bonus));
	}
	
	
}

package main;

public class Developer extends Employee {
	private int overTimeHours;
	
	Developer(String name,int age,double baseSalary,int overTimeHours){
		super(name, age, baseSalary);
		if(overTimeHours<0) {
			System.out.println("Elave saatlar menfi ola bilmez !");
			this.overTimeHours=0;
		}
		else {
			this.overTimeHours=overTimeHours;
		}
	}
	
	public int getOverTimeHours() {
		return this.overTimeHours;
	}

	public void setOverTimeHours(int newHours) {
		if(newHours<0) {
			System.out.println("Elave saatlar menfi ola bimez !");
			this.overTimeHours=0;
		}
		else {
			this.overTimeHours=newHours;
		}
	}
	
	public void calculateSalary() {
		System.out.println("Developer salary with extra hours:"+(this.baseSalary+overTimeHours*30));
	}
	
}

package main;

public class Employee {
private String name;
private int age;
protected double baseSalary;


Employee(String name,int age,double baseSalary){
	this.name=name;
	if(age<0) {
		System.out.println("Yash menfi ola bilmez !");
		this.age=18;
	}
	else {
		this.age=age;
	}
	if(baseSalary<0) {
		System.out.println("Maash menfi ola bilmez !");
		this.baseSalary=500;
	}
	else {
		this.baseSalary=baseSalary;
	}
}

public String getName() {
	return this.name;
}

public void setName(String newName) {
	this.name=newName;
}

public int getAge() {
	return this.age;
}

public void setAge(int newAge) {
	if(newAge<0) {
		System.out.println("Yash menfi ola bilmez !");
		this.age=18;
	}
	else {
		this.age=newAge;
	}

}


public double getBaseSalary() {
	return this.baseSalary;
}


public void setBaseSalary(double newBaseSalary) {
	if(newBaseSalary<0) {
		System.out.println("Maash menfi ola bilmez !");
		this.baseSalary=500;
	}
	else {
		this.baseSalary=newBaseSalary;
	}
}


public void calculateSalary(){
	System.out.println("Employee base salary:"+this.baseSalary);
}


}

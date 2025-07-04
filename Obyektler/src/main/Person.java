package main;

public class Person {
private String name;
private int age;




Person(String name,int age){
	this.name=name;
	if(age<18) {
		System.out.println("Yashi duzgun daxil edin !");
		this.age=18;
	}
	else {
		this.age=age;
	}
}

public void displayPerson() {
	System.out.println("Ad:"+this.name);
	System.out.println("Yash"+this.age);
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
	if(newAge<18) {
		System.out.println("Yashi duzgun daxil edin ! ");
		this.age=18;
	}
	else {
		this.age=newAge;
	}
}



}

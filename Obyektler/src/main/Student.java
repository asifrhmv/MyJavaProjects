package main;

public class Student {
private String name;
private String group;
private int age;
private final String university="Iqtisad Universiteti";
static int studentCount=0;



Student(String name,String group,int age){
	this.name=name;
	this.group=group;
	if(age<18) {
		System.out.println("Yashi duzgun daxil edin !");
		this.age=18;
	}
	else {
		this.age=age;
	}
	studentCount++;
}

public void displayStudent() {
	System.out.println("Telebenin adi:"+this.name);
	System.out.println("Telebenin qrupu:"+this.group);
	System.out.println("Telebenin yashi:"+this.age);
	System.out.println("Telebenin universiteti:"+this.university);
	System.out.println("---------------------------------------");
}

public static void studentCount() {
	System.out.println("Telebe sayi:"+studentCount);
}


public String getName() {
	return this.name;
}
public void setName(String newName) {
	this.name=newName;
}

public String getGroup() {
	return this.group;
}
public void setGroup(String newGroup) {
	this.group=newGroup;
}

public int getAge() {
	return this.age;
}

public void setAge(int newAge) {
	if(newAge<0) {
		System.out.println("YAshi duzgun daxil edin !");
		this.age=18;
	}
	else {
		this.age=newAge;
	}
}





}

package main;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Car car1=new Car("Bmw",2025,"535");
//		Car car2=new Car("Mercedes",2025,"E-Class");
//		
//		car1.DisplayAuto();
//		car2.DisplayAuto();
//		
		
//		Book bk1=new Book("Franz Kafka","Chevrilme");
//		Book bk2=new Book("Fyodor Dostoyevski","Suc ve ceza",1990);
//		
//		
//		
//		bk1.kitabYazdir();
//		bk2.kitabYazdir();
//			University.uniCounter();
//		University uni1=new University("Asif", 333);
//		University uni2=new University("Azer", 456);
//		
////		uni1.changeUni("Iqtisad Universiteti");
//		
////		University.uniCounter();
//	
//		
//		uni1.getUniversity();
//		uni2.getUniversity();
//		
//		
//		University uni3=new University("Togrul", 300);
////		University.uniCounter();
//		uni3.getUniversity();
		
		
		
//		Person p1=new Person("Asif", 24, "asif.rehimov64@gmail.com");
//		
//	
//		p1.setAge(0);
//		
//		p1.displayPerson();
//		
//		
		
//	Employee emp1=new Employee("Asif", 25, "Director", 8000);
//	Employee emp2=new Employee("Orxan", 23, "Developer", 2000);
//
//		
////		System.out.println(emp2.getSalary());
//		emp2.setSalary(2500);
//
//
//		emp1.setSalary(10000);
////		
//		emp1.employeeDisplay();
//		emp2.employeeDisplay();
//		
		
		
//	Account ac1=new Account("Asif Rehimov","12345", 100000, "EUR");
//	Account ac2=new Account("Azer Rehimov", "2468", 20000, "USD");
//		ac1.setBalance(13000);
//		ac1.displayAccount();
//ac2.setCurrency("AED");
//	System.out.println(ac2.getCurrency());
//		ac2.displayAccount();
//		
		
		
//		Student s1=new Student("Asif", "180", 25);
//Student s2=new Student("Azer", "180", 18);
//		
//		
//		
//		
//		s1.displayStudent();
//		s2.displayStudent();
//		
//		Student.studentCount();
		
//	Worker w1=new Worker("Asif", 25, "Kishi", "Direktor", 10000)	;
//		
//
//		
//	w1.setAge(24);
//	
//	w1.displayWorker();
	
//	Animal a1=new Animal("Doggy", 2);
//	
//Dog d1=new Dog("Bobby", 2, "Dalmatian");
//	
//	
//d1.displayAnimal();
//
//a1.makeSound();
//d1.makeSound();

//		
//	Car c1=new Car("BMW", 2020, "X5", 4.8);
//	
//c1.displayCar();
		
		
		
//	Shape s1=new Circle();
//	Shape s2=new Square();
//	Shape s3=new Shape();
//		
//	Shape[] shapes= {s1,s2,s3};	
//		
//		for(Shape c:shapes) {
//			c.draw();
//		}

		
//	Payment p1=new Payment();
//	Payment p2=new BankCard();
//	Payment p3=new Paypal();
//	
//	p2.setAmount(250);
//	p2.pay();
//	
//	p3.setAmount(200);
//	p3.pay();
		
//		
//Employee e3=new Intern("Togrul", 25, 1000, 200);
//e3.calculateSalary();
		
		
//Vehicle v1=new Car("BMW", "535");
//Vehicle v2=new Car("Mercedes","E-Class");	
//Vehicle v3=new Motorcycle("Yamaha", 1000);
//
//		
//Vehicle [] vehicles= {
//		v1,v2,v3
//};
//		
//		
////		for(Vehicle b:vehicles) {
////			b.startEngine();
////		}
////		
//		
//	for(Vehicle a:vehicles) {
//		a.displayCar();
//	}
//		
//		
		
		
//	BankCard b1=new DebitCard("123344", 5000);
//	BankCard b2= new CreditCard("2323566", 1000);
//	BankCard b3=new VirtualCard("1651236", 1000);
//		
//	BankCard[] cards={b1,b2,b3};
//	
////		for(BankCard b:cards) {
////			System.out.println("Card type: "+b.getCardType());;
////		}
//		
//		
////		b2.withdraw(2000);
////		System.out.println(b2.getBalance());
//		
//	
//	b1.withdraw(5000);
//	System.out.println(b1.getBalance());
//	
//	
		
		
		PaymentMethod p1= new Paypal("AA", 1000);
		PaymentMethod p2= new CryptoWallet("BB", 2000);
		PaymentMethod p3=new MobileWallet("CC", 1000);
		
//		PaymentMethod [] metods= {p1,p2,p3};
//		
//		for(PaymentMethod c:metods) {
//			System.out.println("Odenish metodu: "+c.getPaymentType());	
//			}
		
		
		
		
		
//		p1.withdraw(991);
//		System.out.println(p1.getBalance());
	
		p2.withdraw(500);
		System.out.println(p2.getBalance());
		
		
	}

	
	
}

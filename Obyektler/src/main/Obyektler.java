package main;

import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;

public class Obyektler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Students> telebeler=new ArrayList<Students>();

Students student1=new Students("Asif", 24,89.0);
Students student2=new Students("Nubar", 24,78.5);
Students student3=new Students("Rena", 20,75.3);
Students student4=new Students("Azer", 20,85.2);
Students student5=new Students("Togrul", 23,66.5);


telebeler.add(student1);
telebeler.add(student2);
telebeler.add(student3);
telebeler.add(student4);
telebeler.add(student5);

//ortalamaBal(telebeler);
//Students yuksektelebe=maxBal(telebeler);
//System.out.println("En yuksek balli telebe:"+yuksektelebe.ad+" Bali:"+yuksektelebe.bal);

//for(Students student:telebeler) {
//	System.out.println("Ad:"+student.ad);
//}



//int toplam=0;
//for(Students student:telebeler) {
//	toplam=toplam+student.yas;
//}
//
//System.out.println("Telebelerin yashlari cemi:"+toplam);

//for(Students student:telebeler) {
//	if(student.yas>20) {
//		System.out.println(student.ad);
//	}







	











	}
	
	public static void addStudent(ArrayList<Students>list,String ad,int yas,double bal) {
	Students newStudents = new Students(ad, yas, bal);
	list.add(newStudents);
	}
	
	public static void removeStudent(ArrayList<Students>list,String ad) {
		list.remove(list.indexOf(ad));
	}
	
	public static void ortalamaBal(ArrayList<Students>list) {
		double toplam=0;
		for(Students telebe:list) {
			toplam+=telebe.bal;
		}
		double ortalama=toplam/list.size();
		System.out.println(ortalama);
	}
	
	
	public static Students maxBal(ArrayList<Students>list) {
		Students max=list.get(0);
		for(Students telebe:list) {
			if(telebe.bal>max.bal) {
				max=telebe;
			}
		}return max;
	}
	
	public static void zayTelebeler(ArrayList<Students>list) {
		for(Students telebe:list) {
			if (telebe.bal<80) {
				System.out.println("Telebenin adi"+telebe.ad+" Bali:"+telebe.bal);
			}
		}
	}
	
	
	
	
	
	
}











class Students {
	String ad;
	int yas;
	double bal;
	
	public Students(String ad,int yas,double bal) {
		this.ad=ad;
		this.yas=yas;
		this.bal=bal;
	}
}


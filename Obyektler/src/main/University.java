package main;



public class University {
final String universityName="Baki dovlet universiteti";
private String student;
private int id;
private static int counter=0;


public University(String student,int id) {
	this.student=student;
	this.id=id;
	counter++;
}



//public void changeUni(String newName) {
//	universityName=newName;
//}

public void getUniversity() {
	System.out.println("Telebe:"+student);
	System.out.println("Id:"+id);
	System.out.println("Universitet:"+universityName);
	System.out.println("-------------------------");
}


public static void uniCounter() {
	System.out.println("Telebe sayi:"+counter);
}

}

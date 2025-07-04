package main;

public class Book extends Document implements IPrintable,IShareable {
Book(String title,String author,String content){
	super(title, author, content);
}

public void displayInfo() {
	System.out.println("Kitabin adi: "+this.getTitle());
	System.out.println("Muellif: "+this.getAuthor());
	System.out.println("Mezmun: "+this.getContent());
	System.out.println("----------------------------");
}

public void convertPdf() {
	System.out.println(this.getTitle()+" Pdf-e chevrildi !");
}

public void print() { 
	System.out.println("Kitab chap olundu !");
}

public void share() {
	System.out.println("Kitab paylashildi !");
}
}

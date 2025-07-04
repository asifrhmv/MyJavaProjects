package main;

public class Report extends Document implements IPrintable{

	public Report(String title, String author, String content) {
		super(title, author, content);
	}
	
	public void displayInfo() {
		System.out.println("Senedin adi: "+this.getTitle());
		System.out.println("Muellif: "+this.getAuthor());
		System.out.println("Mezmun: "+this.getContent());
		System.out.println("-------------------------");
	}
	
	public void convertPdf() {
		System.out.println(this.getTitle()+" Senedi PDF-e chevrildi ! ");
	}

	public void print() {
		System.out.println("Sened chap olundu !");
	}
	
}

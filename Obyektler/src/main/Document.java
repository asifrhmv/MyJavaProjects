package main;

public abstract class Document {
private String title;
private String author;
private String content;


public Document(String title,String author,String content) {
	this.title=title;
	this.author=author;
	this.content=content;
}

public abstract void displayInfo(); 
	
public abstract void convertPdf();

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}





}

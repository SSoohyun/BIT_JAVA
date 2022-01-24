package org.icarus.beans;

public class BookBean {
	private String title;
	private String author;
	private String publisher;
	
	public BookBean() {
		this.title = null;
		this.author = null;
		this.publisher = null;
	}
	
	public BookBean(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}


	// getter&setter
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}

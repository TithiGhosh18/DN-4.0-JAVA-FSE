package com.library.repository;

public class BookRepository {
	private String BookName;
	private String Author;
	
	
	public String getBookName() {
		return BookName;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}
	
	@Override
	public String toString() {
        return "\n📘 Book: "+this.BookName+"\nAuthor: "+this.Author;
    }

	
}

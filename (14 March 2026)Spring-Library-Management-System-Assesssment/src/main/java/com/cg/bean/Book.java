package com.cg.bean;

public class Book {

    private int bookId;
    private String title;
    private String author;
    Book(){}

    public Book(int bookId, String title, String author) {
        super();
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

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
    public void displayBookDetails(){
        System.out.println("Book Id is: "+getBookId());
        System.out.println("Book title is: "+getTitle());
        System.out.println("Book author is: "+getAuthor());
    }
    public String toString() {
        return
                "BookId=" + bookId +"\n"+
                "Title=" + title + "\n" +
                "Author=" + author + "\n";
    }

}

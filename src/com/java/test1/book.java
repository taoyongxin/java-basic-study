package com.java.test1;

/**
 * @author Tao
 */
public class book {
    private String isbn;
    private String bookName;
    private Double price;

    public book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public book(String isbn, String bookName, Double price) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.price = price;
    }
}


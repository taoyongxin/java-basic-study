package com.java.BookException;

/**
 * 图书实体类
 * @author Tao
 */

public class Book {
    private String ISBN;
    private String name;
    private Double price;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(String ISBN, String name, Double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }
}

package com.java.test1;

public class PutawayBookTest {
    public static void main(String[] args) {

        book book1 = new book("1234567891011","暴力",60.2);
        book book2 = new book("1234567891011","三国演义",160.2);
        book book3 = new book("12345667891012","水浒传",60.2);
        putaway putaway1 = new putawayImpl();
        try {
                putaway1.putawayBook(book1);
        } catch (PutawayBookException e){
            System.err.println(e.toString());
        }
        try {
            putaway1.putawayBook(book2);
        } catch (PutawayBookException e){
            System.err.println(e.toString());
        }
        try {
            putaway1.putawayBook(book3);
        } catch (PutawayBookException e){
            System.err.println(e.toString());
        }

    }
}

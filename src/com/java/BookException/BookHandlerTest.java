package com.java.BookException;

import java.util.ArrayList;
import java.util.List;

/**J
 * @author Tao
 */
public class BookHandlerTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("51151515","JAVA从入门到精通",111.1));
        books.add(new Book("1112223330102","深入理解JVM",111.1));
        books.add(new Book("1112223330103","java编程思想",99.9));
        books.add(new Book("1112223330104","暴力的java",111.1));
        books.add(new Book("1112223330105","疯狂java讲义",88.8));
        BookHandler bookHandler = new BookHandlerImpl();
        for (Book book : books){
            try {
                if (bookHandler.handlerBook(book)){
                    System.out.println(("《" + book.getName()+"》"+"通过检测，可以上架"));

                }
            } catch (NotDigitException | ForbiddenWordsException | BoundException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

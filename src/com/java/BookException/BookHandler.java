package com.java.BookException;

/**
 * 图书处理接口
 * @author Tao
 */
public interface BookHandler {
    boolean handlerBook(Book book) throws NotDigitException,ForbiddenWordsException,BoundException;
}

package com.java.BookException;

/**
 * 禁词异常
 * @author Tao
 */
public class ForbiddenWordsException extends Exception{
    public ForbiddenWordsException(String message){
        super(message);
    }

}

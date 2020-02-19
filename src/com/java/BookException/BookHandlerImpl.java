package com.java.BookException;

/**
 * @author Tao
 */
public class BookHandlerImpl implements BookHandler{
    @Override
    public boolean handlerBook(Book book) throws NotDigitException, ForbiddenWordsException, BoundException {
        String ISBN = book.getISBN();
        String name = book.getName();
        double price = book.getPrice();
        //验证非0开头的数字字符串
        String regex = "^([1-9][0-9]*)$";
        if (ISBN.length() != 13 || !ISBN.matches(regex)){
            throw new NotDigitException("《" + book.getName()+"》"+"ISBN不是13位数字");
        }
        if(name.contains("暴力") || name.contains("恐怖")){
            throw new ForbiddenWordsException("《" + book.getName()+"》"+"书名含有禁词");
        }
        if (price>100){
            throw new BoundException("《" + book.getName()+"》"+"价格超过100元");
        }
        return true;
    }
}

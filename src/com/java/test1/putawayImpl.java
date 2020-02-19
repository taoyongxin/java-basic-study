package com.java.test1;

public class putawayImpl implements putaway {
    @Override
    public void putawayBook(book book1) throws PutawayBookException {
        if (book1.getIsbn().length()!=13){
            throw new PutawayBookException("ISBN不是13位数字组成");
        }else{
            System.out.println("编码正确");
        }

        if (book1.getBookName().equals("暴力") || book1.getBookName().equals("恐怖")){
            throw new PutawayBookException("出现禁词");
        }else {
            System.out.println("未出现禁词");
        }

        if(book1.getPrice()>100){
            throw new PutawayBookException("价格超过100");
        }else{
            System.out.println("价格未超过");
        }
    }
}

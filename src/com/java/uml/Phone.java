package com.java.uml;

/**
 * @author Tao
 */
public class Phone {
    private Integer id;
    private String brand;
    private Double price;

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public  Phone(Integer id, String brand, Double price){
        this.id = id;
        this.brand = brand;
        this.price = price;
    }
    public Phone(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

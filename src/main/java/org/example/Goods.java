package org.example;

public class Goods {

    private String name;
    private Double price;
    private String variety;

    public Goods(String name, Double price, String variety) {
        this.name = name;
        this.price = price;
        this.variety = variety;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public  double getPrice(){return price;}
    public void setPrice(Double price) {this.price = price;}
    public String getVariety(){return variety;}
    public void setVariety(String variety) {
        this.variety = variety;
    }


}




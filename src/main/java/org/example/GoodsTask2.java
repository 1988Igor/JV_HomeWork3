package org.example;

public class GoodsTask2 {
    private String product_name;
    private String manufacture_country;
    private Double weight;
    private Double prices;
    private String varieties;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getManufacture_country() {
        return manufacture_country;
    }

    public void setManufacture_country(String manufacture_country) {
        this.manufacture_country = manufacture_country;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    public GoodsTask2(String product_name, String manufacture_country, Double weight, Double prices, String varieties) {
        this.product_name = product_name;
        this.manufacture_country = manufacture_country;
        this.weight = weight;
        this.prices = prices;
        this.varieties = varieties;
    }
}


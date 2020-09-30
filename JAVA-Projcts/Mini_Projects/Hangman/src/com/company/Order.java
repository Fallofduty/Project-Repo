package com.company;

public class Order {
    private String itemName;
    private int priceInCents;
    private String discountCode;

    public Order(String itemName, int priceInCents,String code) {
        this.itemName = itemName;
        this.priceInCents = priceInCents;
        this.discountCode = normalizeDiscountCode();
    }

    public String getItemName() {
        return itemName;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void applyDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    private String normalizeDiscountCode(){
        return discountCode.toUpperCase();


    }
}

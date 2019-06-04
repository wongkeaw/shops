package com.driveto.shops.model;

public class ShopItem {

    private  String name ;
    private  String description ;
    private  long amountDue ;
    private  long amountMade ;
    private String imgUrl ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(long amountDue) {
        this.amountDue = amountDue;
    }

    public long getAmountMade() {
        return amountMade;
    }

    public void setAmountMade(long amountMade) {
        this.amountMade = amountMade;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

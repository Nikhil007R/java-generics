package com.bridgelabz.onlineMarketPlace;

public class Clothing implements ProductCategory{
    private String categoryName = "Clothing";

    @Override
    public String getCategoryName() {
        return categoryName;
    }
}

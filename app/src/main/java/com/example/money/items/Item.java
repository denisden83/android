package com.example.money.items;

public class Item {
    private final String title;
    private final String price;

    public Item(String title, String price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }
}

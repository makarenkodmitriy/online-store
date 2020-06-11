package com.dmitriy.makarenko;

public class Product {
    private String name;
    private float price;
    private int count;
    private int id;

    public Product(String name, float price, int count, int id) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Название товара: " + name + "\t Цена товара: " + price + "\t Количество товара: " + count + "\t Код товара: " + id + "\n";
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

}


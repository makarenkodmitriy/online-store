package com.dmitriy.makarenko;

public class Product {
    private String name;
    private float price;
    private int number;
    private int id;

    Product(String name, float price, int id, int number) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.number = number;
    }
    @Override
    public String toString(){
        return "Название товара: " + name + "\t Цена товара: " + price + "\t Количество товара: " + number + "\t Артикул: " + id + "\n";
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

    public int getNumber() {
        return number;
    }

}


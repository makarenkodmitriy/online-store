package com.dmitriy.makarenko;

import java.util.Scanner;

public class MainStore {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.addProductToCatalog(addProduct());
        System.out.println("Список товаров: \n" + catalog.getCatalog().toString());
    }

    public static Product addProduct() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        String name = in.nextLine();
        System.out.print("Введите цену товара: ");
        float price = in.nextFloat();
        System.out.print("Введите количество товара: ");
        int number = in.nextInt();
        System.out.print("Введите артикул товара: ");
        int id = in.nextInt();
        return new Product(name, price, id, number);
    }
}

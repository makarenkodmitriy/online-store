package com.dmitriy.makarenko;

import db.ProductRepository;

import java.io.*;
import java.util.*;

public class MainStore {
    public static void main(String[] args) throws IOException {
        // Catalog catalog = new Catalog();
        ProductRepository productRepository = new ProductRepository();
        System.out.println("Добро пожаловать в наш онлайн-магазин!");
        int level0 = 0;
        while (level0 != 3) {
            System.out.println("Выберите опцию: 1 - Добавить товар, 2 - Просмотреть товар, 3 - Выйти из магазина");
            System.out.print("Введите номер опции: ");
            Scanner in = new Scanner(System.in);
            level0 = in.nextInt();
            switch (level0) {
                case 1:
                    // catalog.addProductToCatalog(createProduct());
                    productRepository.saveProductToFile(createProduct());
                    int level1 = 0;
                    while (level1 != 2) {
                        System.out.println("Выберите опцию: 1 - Добавить еще товар, 2 - Выйти в предыдущее меню");
                        System.out.print("Введите номер опции: ");
                        Scanner n = new Scanner(System.in);
                        level1 = n.nextInt();
                        switch (level1) {
                            case 1:
                                // catalog.addProductToCatalog(createProduct());
                                productRepository.saveProductToFile(createProduct());
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Вы не сделали выбор!");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Список товаров: ");
                    System.out.println(productRepository.getProductFromFile().toString());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Вы не выбрали опцию!");
            }
        }

    }

    public static Product createProduct() throws IOException {
        Scanner in = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()) {
            try {
                System.out.print("Введите название товара: ");
                name = in.nextLine();
                if (name.isEmpty()) {
                    throw new IOException("Название товара не должно быть пустым!");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        float price = 0;
        while (price <= 0) {
            try {
                System.out.print("Введите цену товара: ");
                price = in.nextFloat();
                if (price <= 0) {
                    throw new IOException("Цена не может быть отрицательной и равной нулю!");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        int count = 0;
        while (count <= 0) {
            try {
                System.out.print("Введите количество товара: ");
                count = in.nextInt();
                if (count <= 0) {
                    throw new IOException("Количество товара не может быть отрицательным и равным нулю!");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        int id = (int) (Math.random() * 10000000);
        return new Product(name, price, count, id);
    }
}


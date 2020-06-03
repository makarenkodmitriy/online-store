package com.dmitriy.makarenko;

import java.io.IOException;
import java.util.*;

public class MainStore {
    public static void main(String[] args) throws IOException {
        Catalog catalog = new Catalog();
        System.out.println("Добро пожаловать в наш онлайн-магазин!");
        int num = 0;
        while (num != 3) {
            System.out.println("Выберите опцию: 1 - Добавить товар, 2 - Просмотреть товар, 3 - Выйти из магазина");
            System.out.print("Введите номер опции: ");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            switch (num) {
                case 1:
                    catalog.addProductToCatalog(addProduct());
                    int n1 = 0;
                    while (n1 != 2) {
                        System.out.println("Выберите опцию: 1 - Добавить еще товар, 2 - Выйти в предыдущее меню");
                        System.out.print("Введите номер опции: ");
                        Scanner n = new Scanner(System.in);
                        n1 = n.nextInt();
                        switch (n1) {
                            case 1:
                                catalog.addProductToCatalog(addProduct());
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Вы не сделали выбор!");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Список товаров: \n" + catalog.getCatalog().toString());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Вы не выбрали опцию!");
            }
        }

    }

    public static Product addProduct() throws IOException {
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
        int number = 0;
        while (number <= 0) {
            try {
                System.out.print("Введите количество товара: ");
                number = in.nextInt();
                if (number <= 0) {
                    throw new IOException("Количество товара не может быть отрицательным и равным нулю!");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        String id = UUID.randomUUID().toString();
        return new Product(name, price, id, number);
    }
}

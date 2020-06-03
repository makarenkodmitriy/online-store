package com.dmitriy.makarenko;

import java.util.Scanner;

public class MainStore {
    public static void main(String[] args) {
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

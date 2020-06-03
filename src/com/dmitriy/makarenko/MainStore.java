package com.dmitriy.makarenko;

import java.util.Scanner;

public class MainStore {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        System.out.println("Добро пожаловать в наш онлайн-магазин!");
        System.out.println("Выберите опцию: 1 - Добавить товар, 2 - Просмотреть товар");
        System.out.print("Введите номер опции: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num){
            case 1:
                catalog.addProductToCatalog(addProduct());
                System.out.print("Для просмотра введенного товара нажмите 2, а для выхода - 3: ");
                Scanner n = new Scanner(System.in);
                int n1 = n.nextInt();
                if (n1 == 2){
                    System.out.println("Список товаров: \n" + catalog.getCatalog().toString());
                    break;
                }else if (n1 == 3){
                    break;
                }else if (n1 != 2 && n1 != 3) {
                    System.out.println("Вы не сделали выбор!");
                    break;
                }
            case 2:
                System.out.println("Список товаров: \n" + catalog.getCatalog().toString());
                break;
            default:
                System.out.println("Вы не выбрали опцию!");
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

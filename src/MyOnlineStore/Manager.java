package MyOnlineStore;

import java.util.*;

public class Manager {
    private Product product;
    private String name;

    Manager(Product product, String name) {
        this.product = product;
        this.name = name;
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

package MyOnlineStore;

import java.io.IOException;
import java.util.*;

public class Product {
    private String name;
    private float price;
    private int id;

    Product(String name, float price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName (){
        return name;
    }

    public float getPrice() {
        return price;
    }
    public int getId(){
        return id;
    }
    public void ShowProduct(){
        System.out.printf("Товар: %s\t Цена: %.2f\t Артикул: %d\n", getName(), getPrice(), getId());
    }

    public void setPrice(float price) throws IOException {
        try {
            if (price<=0){ throw new IOException("Цена не может равняться нулю и быть отрицательной! ");}
            this.price = price;
            System.out.printf("Цена товара изменена успешно! Новая цена: %.2f\n", + price);
            }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Цена товара не изменена!");
        }
    }
}

package MyOnlineStore;

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
        return "Название товара: " + name + "\t Цена товара: " + price + "\t Количество товара: " + number + "\t Артикул: " + id;
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

    public void setPrice() {
        if (price >= 0) {
            this.price = price;
            System.out.println("Цена успешно изменена!");
        }
        System.out.println("Цена не может быть отрицательной!");
    }

    public void setNumber() {
        if (number >= 0) {
            this.number = number;
            System.out.println("Количество товара успешно изменено!");
        }
        System.out.println("Количество не может быть отрицательным!");
    }

}


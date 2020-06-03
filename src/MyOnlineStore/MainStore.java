package MyOnlineStore;

public class MainStore {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.addProductToCatalog(Manager.addProduct());
        System.out.println("Список товаров: \n" + catalog.getCatalog().toString());
    }
}

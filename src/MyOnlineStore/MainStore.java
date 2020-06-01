package MyOnlineStore;

import java.io.IOException;

public class MainStore {
    public static void main (String[] args) throws IOException {
            Product product = new Product("Processor", 157.75F, 364923642);
            product.ShowProduct();
            product.setPrice(-25.56F);
            product.ShowProduct();
    }
}

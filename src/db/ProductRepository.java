package db;

import com.dmitriy.makarenko.MainStore;
import com.dmitriy.makarenko.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public void saveProductToFile(Product product) throws IOException {
        String save = "" + product.getName() + " " + product.getPrice() + " " + product.getCount() + " " + product.getId();
        try (FileWriter writer = new FileWriter("base.txt", true)) {
            writer.write(save);
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Product> getProductFromFile() throws IOException {
        ArrayList<Product> arrayProduct = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("base.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] strings = line.split(" ");
                Product product = new Product(strings[0], Float.parseFloat(strings[1]), Integer.parseInt(strings[2]), Integer.parseInt(strings[3]));
                arrayProduct.add(product);
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return arrayProduct;
    }
}

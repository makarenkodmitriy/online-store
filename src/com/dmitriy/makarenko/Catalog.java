package com.dmitriy.makarenko;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Product> catalog = new ArrayList<>();

    public void addProductToCatalog(Product product) {
        catalog.add(product);
    }

    public List<Product> getCatalog() {
        return this.catalog;
    }
}

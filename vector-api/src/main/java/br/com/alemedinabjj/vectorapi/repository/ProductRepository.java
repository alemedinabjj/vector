package br.com.alemedinabjj.vectorapi.repository;

import br.com.alemedinabjj.vectorapi.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductRepository {

    private static List<Product> productDatabase = new ArrayList<>();

    public static void insertProduct(Product product) {
        productDatabase.add(product);
    }

    public static List<Product> getAllProducts() {
        return productDatabase;
    }

    public static void initializeDatabase() {

    }
}

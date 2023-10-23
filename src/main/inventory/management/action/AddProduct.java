package main.inventory.management.action;

import main.inventory.management.model.Product;

import java.util.List;

/**
 * This is "ADD" COMMAND CONCRETE CLASSES for the COMMAND INTERFACE - ACTION.
 */
public class AddProduct implements Action {

    public List<Product> products;
    Product product;

    public AddProduct(Product product, List<Product> products) {
        this.product = product;
        this.products = products;
    }

    @Override
    public void execute() {
        products.add(product);
    }
}

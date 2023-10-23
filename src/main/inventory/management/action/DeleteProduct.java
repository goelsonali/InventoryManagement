package main.inventory.management.action;

import main.inventory.management.model.Product;

import java.util.List;

/**
 * This is "DELETE" COMMAND CONCRETE CLASSES for the COMMAND INTERFACE - ACTION.
 */
public class DeleteProduct implements Action {

    String productName;
    public List<Product> products;

    public DeleteProduct(String productName, List<Product> products) {
        this.productName = productName;
        this.products = products;
    }
    @Override
    public void execute() {
        products.removeIf(p-> p.name().equalsIgnoreCase(productName));
    }
}

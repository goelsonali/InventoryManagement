package main.inventory.management.action;

import main.inventory.management.model.Product;

import java.util.List;

/**
 * This is "UPDATE" COMMAND CONCRETE CLASSES for the COMMAND INTERFACE - ACTION.
 */
public class UpdateProduct implements Action {
    Product product;
    public List<Product> products;
    public UpdateProduct(Product product,List<Product> products) {
        this.product = product;
        this.products = products;
    }
    @Override
    public void execute() {
        if(products.size() > 0) {
            for (Product existingProduct: products) {
                if(existingProduct.name().equalsIgnoreCase(product.name())) {
                    existingProduct.setPrice(product.price());
                    existingProduct.setQuantity(product.quantity());
                    existingProduct.setPrice(product.price());
                    existingProduct.setDescription(product.description());
                }
            }
        }
    }
}

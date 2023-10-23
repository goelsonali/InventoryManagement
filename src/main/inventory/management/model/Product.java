package main.inventory.management.model;

import java.util.Objects;

/**
 * Model class for the Product.
 */
public class Product {

    String name;
    String description;

    Double price;

    Integer quantity;

    public Product(String name, String description, Double price, Integer quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double price() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer quantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && Objects.equals(description, product.description) && price.equals(product.price) && quantity.equals(product.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, quantity);
    }
}

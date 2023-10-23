package main.inventory.management.exception;

/**
 * Added to implement any custom exception if required.
 */
public class ProductNotFoundException extends IllegalArgumentException {

    public ProductNotFoundException(String message) {
        super(message);
    }
}

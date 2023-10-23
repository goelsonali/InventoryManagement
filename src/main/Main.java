package main;

import main.inventory.management.action.AddProduct;
import main.inventory.management.action.DeleteProduct;
import main.inventory.management.action.UpdateProduct;
import main.inventory.management.invoker.ProductActionInvoker;
import main.inventory.management.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the main class for the program to demonstrate the use of COMMAND PATTERN.
 */
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Product1","It is the description of product1", 10.15,5);
        Product product2 = new Product("Product2","It is the description of product2", 20.15,5);
        Product product3 = new Product("Product3","It is the description of product3", 30.15,5);

        final List<Product> products = new ArrayList<>();

        ProductActionInvoker actionInvoker = new ProductActionInvoker();

        //Add Action
        actionInvoker.addAction(new AddProduct(product1,products));
        actionInvoker.addAction(new AddProduct(product2,products));
        actionInvoker.addAction(new AddProduct(product3,products));

        actionInvoker.executeAllActions();
        //Display all the added products
        displayProducts(products, "ADD");

        //Delete Action
        actionInvoker.addAction(new DeleteProduct("Product1",products));
        actionInvoker.executeAllActions();
        //Display products after deletion
        displayProducts(products, "DELETE");

        //Update Action
        actionInvoker.addAction(new UpdateProduct(new Product("Product2","Your Description should be updated to PRODUCT 2", 20.15,5), products));
        actionInvoker.executeAllActions();
        //Display products after update
        displayProducts(products, "UPDATE");


    }

    /**
     * To display the products details and after the action is performed.
     * @param products  list of products to be displayed
     * @param actionName name of the action - ADD, DELETE, UPDATE
     */
    public static void displayProducts(List<Product> products, String actionName) {
        System.out.println("The Status of Products after the action " + actionName);
        for (Product addedProduct: products) {
            System.out.println("Name of the Product is : " + addedProduct.name());
            System.out.println("Description of the Product is : " + addedProduct.description());
            System.out.println("Price of the Product is : " + addedProduct.price());
            System.out.println("Quantity of the Product is : " + addedProduct.quantity());
        }
    }

}
package test.inventory.management.action;

import main.inventory.management.action.AddProduct;
import main.inventory.management.model.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the @link AddProduct
 */
public class AddProductTest {
    AddProduct classUnderTest;
    Product productToBeAdded;

    @Before
    public void init() {
        productToBeAdded = new Product("ProductTest1", "Desc p1",10.10,1);
    }

    @Test
    public void productAddedToEmptyList() {
        List<Product> emptyProducts = new ArrayList<>();
        List<Product> expectedProductList = new ArrayList<>();
        expectedProductList.add(productToBeAdded);
        classUnderTest = new AddProduct(productToBeAdded,emptyProducts);
        classUnderTest.execute();
        assertEquals(1,classUnderTest.products.size());
        assertEquals(expectedProductList,classUnderTest.products);
    }

    @Test
    public void productAddedToExistingList() {
        List<Product> existingProductsList = new ArrayList<>();
        existingProductsList.add(productToBeAdded);

        Product newProduct = new Product("ProductTest1", "Desc p1",10.10,1);

        List<Product> expectedProductList = new ArrayList<>();
        expectedProductList.add(productToBeAdded);
        expectedProductList.add(newProduct);

        classUnderTest = new AddProduct(newProduct,existingProductsList);
        classUnderTest.execute();

        assertEquals(expectedProductList,classUnderTest.products);
    }
}

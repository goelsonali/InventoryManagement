package test.inventory.management.action;

import main.inventory.management.action.DeleteProduct;
import main.inventory.management.model.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the @link DeleteProduct
 */
public class DeleteProductTest {

    DeleteProduct classUnderTest;
    List<Product> productsExists = new ArrayList<>();
    Product product1;
    Product product2;

    @Before
    public void init() {
        product1= new Product("ProductTest1", "Desc p1",10.10,1);
        product2 = new Product("ProductTest2", "Desc p2",20.10,2);
        productsExists.add(product1);
        productsExists.add(product2);
    }

    @Test
    public void deleteWhenEmptyList() {
        classUnderTest = new DeleteProduct("ProductTest1",new ArrayList<>());
        classUnderTest.execute();
        assertEquals(0,classUnderTest.products.size());
    }

    @Test
    public void deleteValidRecord() {
        List<Product> expectedProductList = new ArrayList<>();
        expectedProductList.add(product1);
        classUnderTest = new DeleteProduct("ProductTest2",productsExists);
        classUnderTest.execute();

        assertEquals(expectedProductList,classUnderTest.products);
    }

    @Test
    public void deleteNotValidRecord() {
        List<Product> expectedProductList = new ArrayList<>();
        expectedProductList.add(product1);
        expectedProductList.add(product2);
        classUnderTest = new DeleteProduct("ProductNotExist",productsExists);
        classUnderTest.execute();

        assertEquals(expectedProductList,classUnderTest.products);
    }
}

package Exo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class InventoryManagerTestParameters {

    private String productName;

    private int initialStock;
    private int quantityToRemove;
    private int expectedStockAfterRemoval;

    public InventoryManagerTestParameters(String productName, int initialStock, int quantityToRemove, int expectedStockAfterRemoval) {
        this.productName = productName;
        this.initialStock = initialStock;
        this.quantityToRemove = quantityToRemove;
        this.expectedStockAfterRemoval = expectedStockAfterRemoval;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Pomme", 100, 50, 50}, // Stock suffisant
                {"Banane", 5, 10, 5},    // Stock insuffisant
                {"Orange", 0, 1, 0},     // Stock vide
                {"Fraise", 0, 5, 0}      // Produit non existant
        });
    }

    @Test
    public void testRemoveProduct() {
        InventoryManager manager = new InventoryManager();
        if (productName != "Fraise"){
            manager.addProduct(productName, initialStock);
        }
        boolean isEmpty = false;
        try {
            if (manager.getStock(productName) == 0){
                isEmpty = true;
            }
            manager.removeProduct(productName, quantityToRemove);
        } catch (IllegalArgumentException e) {
            if (isEmpty){
                fail("Stock vide");
            }
            fail(e.getMessage());
        }
        assertEquals(expectedStockAfterRemoval, manager.getStock(productName));
    }
}
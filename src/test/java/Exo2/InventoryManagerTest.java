package Exo2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Cette classe contient des tests unitaires pour la classe InventoryManager.
 */
public class InventoryManagerTest {

    /**
     * Teste le cas où le stock est suffisant pour retirer un produit.
     */
    @Test
    public void testStockSuffisant() {
        InventoryManager manager = new InventoryManager();
        manager.addProduct("Pomme", 100);
        try {
            manager.removeProduct("Pomme", 50);
        } catch (IllegalArgumentException e) {
            fail("Le retrait aurait dû réussir, mais une exception a été levée.");
        }
        assertEquals(50, manager.getStock("Pomme"));
    }

    /**
     * Teste le cas où le stock est insuffisant pour retirer un produit.
     */
    @Test
    public void testStockInsuffisant() {
        InventoryManager manager = new InventoryManager();
        manager.addProduct("Banane", 5);
        try {
            manager.removeProduct("Banane", 10);
        } catch (IllegalArgumentException e) {
            fail(e.getMessage());
        }
        assertEquals(5, manager.getStock("Banane"));
    }

    /**
     * Teste le cas où le stock est vide pour retirer un produit.
     */
    @Test
    public void testStockVide() {
        InventoryManager manager = new InventoryManager();
        manager.addProduct("Orange", 0);
        try {
            manager.removeProduct("Orange", 1);
        } catch (IllegalArgumentException e) {
            fail(e.getMessage());
        }
        assertEquals(0, manager.getStock("Orange"));
    }

    /**
     * Teste le cas où le produit n'existe pas dans l'inventaire.
     */
    @Test
    public void testProduitNonExistant() {
        InventoryManager manager = new InventoryManager();
        try {
            manager.removeProduct("Fraise", 5);
        } catch (IllegalArgumentException e) {
            fail(e.getMessage());
        }
        assertEquals(0, manager.getStock("Fraise"));
    }
}

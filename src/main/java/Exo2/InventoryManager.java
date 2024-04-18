package Exo2;

import java.util.HashMap;
import java.util.Map;

/**
 * Cette classe gère un inventaire de produits avec leurs quantités associées.
 */
public class InventoryManager {
    // Attribut pour stocker les produits et leurs quantités
    private Map<String, Integer> inventory;

    /**
     * Constructeur par défaut de la classe InventoryManager.
     * Initialise l'inventaire comme une nouvelle instance de HashMap.
     */
    public InventoryManager() {
        inventory = new HashMap<>();
    }

    /**
     * Ajoute un produit avec une quantité à l'inventaire.
     *
     * @param product   Le nom du produit à ajouter.
     * @param quantity  La quantité du produit à ajouter.
     */
    public void addProduct(String product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
    }

    /**
     * Retire un produit de l'inventaire avec une certaine quantité.
     *
     * @param product           Le nom du produit à retirer.
     * @param quantityToRemove  La quantité du produit à retirer.
     * @throws IllegalArgumentException Si le produit n'est pas présent dans l'inventaire ou si la quantité à retirer est supérieure à celle disponible.
     */
    public void removeProduct(String product, int quantityToRemove) {
        if (!inventory.containsKey(product)) {
            throw new IllegalArgumentException("Le produit n'est pas présent dans l'inventaire.");
        }

        int currentQuantity = inventory.get(product);
        if (currentQuantity < quantityToRemove) {
            throw new IllegalArgumentException("La quantité à retirer est supérieure à celle disponible dans l'inventaire.");
        }

        inventory.put(product, currentQuantity - quantityToRemove);
    }

    /**
     * Récupère la quantité disponible d'un produit dans l'inventaire.
     *
     * @param product   Le nom du produit dont on souhaite récupérer la quantité.
     * @return La quantité disponible du produit dans l'inventaire, ou 0 si le produit n'est pas présent.
     */
    public int getStock(String product) {
        return inventory.getOrDefault(product, 0);
    }
}

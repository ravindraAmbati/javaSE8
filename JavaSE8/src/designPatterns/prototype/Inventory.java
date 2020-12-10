package designPatterns.prototype;

import java.time.LocalDate;
import java.util.HashMap;

public class Inventory {

    HashMap<Long, Product> inventory = new HashMap<>();

    public void loadProducts() {
        Product p1 = new Product(1L, "p1", LocalDate.of(2020, 12, 1), LocalDate.of(2021, 12, 1));
        Product p2 = new Product(2L, "p2", LocalDate.of(2020, 12, 1), LocalDate.of(2021, 1, 1));
        Product p3 = new Product(3L, "p3", LocalDate.of(2020, 12, 1), LocalDate.of(2021, 12, 10));
        inventory.put(p1.getIsin(), p1);
        inventory.put(p2.getIsin(), p2);
        inventory.put(p3.getIsin(), p3);
    }

    public Product getProduct(long isin) {
        return (Product) inventory.get(isin).duplicate();
    }

    public HashMap<Long, Product> getInventory() {
        return inventory;
    }
}

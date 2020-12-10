package designPatterns.prototype;

public class App {
    public static void main(String[] args) {
        System.out.println("App");
        Inventory inventory = new Inventory();
        inventory.loadProducts();
        System.out.println(inventory.getInventory());
        Product product = inventory.getProduct(2L);
        product.setName("changedAgain");
        System.out.println(product);
        System.out.println(inventory.getInventory().get(2L));
        System.out.println(inventory.getInventory());
    }
}

// Main.java

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product(1, "Laptop", 1200, 10);
        Product smartphone = new Product(2, "Smartphone", 800, 20);

        Inventory inventory = new Inventory();
        inventory.addProduct(laptop);
        inventory.addProduct(smartphone);

        inventory.displayInventory();

        // Update quantity of Laptop
        int updatedQuantity = 15;
        if (inventory.updateProductQuantity(1, updatedQuantity)) {
            System.out.println("Quantity updated successfully!");
        } else {
            System.out.println("Product not found.");
        }

        inventory.displayInventory();
    }
}

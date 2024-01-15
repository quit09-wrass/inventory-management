// Inventory.java

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            product.displayProduct();
        }
    }

    public Product getProductById(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    public boolean updateProductQuantity(int productId, int quantity) {
        Product product = getProductById(productId);
        if (product != null) {
            product.setQuantity(quantity);
            return true;
        }
        return false;
    }
}

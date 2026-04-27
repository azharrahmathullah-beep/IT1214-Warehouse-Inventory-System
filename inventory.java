import java.util.ArrayList;

public class Inventory {

    public ArrayList<Product> products = new ArrayList<>();

    // Add product
    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product Added!");
    }

    // View all products
    public void viewAll() {
        if (products.size() == 0) {
            System.out.println("No products available.");
            return;
        }

        for (int i = 0; i < products.size(); i++) {
            products.get(i).display();
        }
    }

    // View by category
    public void viewByCategory(String category) {
        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            if (p.category.equals(category)) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products in this category.");
        }
    }

    // Update quantity
    public void updateQuantity(int id, int qty) {
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            if (p.id == id) {
                p.quantity = qty;
                System.out.println("Updated!");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Delete product
    public void deleteProduct(int id) {
        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == id) {
                products.remove(i);
                System.out.println("Product Deleted!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }
}


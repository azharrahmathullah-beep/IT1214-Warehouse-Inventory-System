import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product Added!");
    }

    public void viewAll() {
        if (products.size() == 0) {
            System.out.println("No products available.");
            return;
        }

        for (int i = 0; i < products.size(); i++) {
            products.get(i).display();
        }
    }

  
    public void viewByCategory(String category) {
        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            if (p.getCategory().equals(category)) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products in this category.");
        }
    }

    public void updateQuantity(int id, int qty) {
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            if (p.getId() == id) {
                p.setQuantity(qty);
                System.out.println("Updated!");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    
    public void deleteProduct(int id) {
        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
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
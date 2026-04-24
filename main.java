import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add Product");
            System.out.println("2. View All");
            System.out.println("3. View by Category");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    inv.addProduct(new Product(id, name, category, qty, price));
                    break;

                case 2:
                    inv.viewAll();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Category: ");
                    String cat = sc.nextLine();
                    inv.viewByCategory(cat);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int uid = sc.nextInt();

                    System.out.print("New Qty: ");
                    int newQty = sc.nextInt();

                    inv.updateQuantity(uid, newQty);
                    break;

                case 5:
                    System.out.print("ID: ");
                    int did = sc.nextInt();
                    inv.deleteProduct(did);
                    break;

                case 6:
                    System.out.println("Exit...");
                    return;

                default:
                    System.out.println("Invalid!");
            }
        }
    }
}
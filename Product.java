public class Product {
    public int id;
    public String name;
    public String category;
    public int quantity;
    public double price;

    
    public Product(int id, String name,            
String category, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

   
    public void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Category: " + category +
                ", Qty: " + quantity +
                ", Price: " + price);
    }
}
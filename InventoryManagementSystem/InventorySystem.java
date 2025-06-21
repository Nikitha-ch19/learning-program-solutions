import java.util.HashMap;
import java.util.Scanner;

public class InventorySystem {
    private static HashMap<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product\n2. Update Product\n3. Delete Product\n4. View All\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter Product ID: ");
                String id = scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Quantity: ");
                int qty = scanner.nextInt();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                Product p = new Product(id, name, qty, price);
                inventory.put(id, p);
                System.out.println("Product Added!");

            } else if (choice == 2) {
                System.out.print("Enter Product ID to update: ");
                String id = scanner.nextLine();
                if (inventory.containsKey(id)) {
                    System.out.print("New Quantity: ");
                    int qty = scanner.nextInt();
                    System.out.print("New Price: ");
                    double price = scanner.nextDouble();
                    Product p = inventory.get(id);
                    p.setQuantity(qty);
                    p.setPrice(price);
                    System.out.println("Product Updated!");
                } else {
                    System.out.println("Product not found.");
                }

            } else if (choice == 3) {
                System.out.print("Enter Product ID to delete: ");
                String id = scanner.nextLine();
                if (inventory.remove(id) != null)
                    System.out.println("Deleted.");
                else
                    System.out.println("Product not found.");

            } else if (choice == 4) {
                if (inventory.isEmpty()) {
                    System.out.println("No products.");
                } else {
                    for (Product p : inventory.values()) {
                        System.out.println(p);
                    }
                }

            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class TestSearch {
    public static void main(String[] args) {
        Product1[] products = {
            new Product1("P101", "Shampoo", "Personal Care"),
            new Product1("P102", "Laptop", "Electronics"),
            new Product1("P103", "Book", "Education"),
            new Product1("P104", "Shoes", "Footwear"),
            new Product1("P105", "Mobile", "Electronics")
        };

        // Linear Search
        System.out.println("Linear Search for 'Laptop':");
        Product1 p1 = SearchUtility.linearSearch(products, "Laptop");
        System.out.println(p1 != null ? p1 : "Not Found");

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        System.out.println("\nBinary Search for 'Laptop':");
        Product1 p2 = SearchUtility.binarySearch(products, "Laptop");
        System.out.println(p2 != null ? p2 : "Not Found");
    }
}

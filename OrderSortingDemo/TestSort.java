public class TestSort {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Aditi", 999.50),
            new Order("O102", "Karan", 5499.99),
            new Order("O103", "Nisha", 1499.00),
            new Order("O104", "Rahul", 299.00),
            new Order("O105", "Sneha", 10999.00)
        };

        // Bubble Sort
        System.out.println("Sorted by Bubble Sort (High to Low):");
        SortUtility.bubbleSort(orders);
        SortUtility.displayOrders(orders);

        // Reset array
        orders = new Order[] {
            new Order("O101", "Aditi", 999.50),
            new Order("O102", "Karan", 5499.99),
            new Order("O103", "Nisha", 1499.00),
            new Order("O104", "Rahul", 299.00),
            new Order("O105", "Sneha", 10999.00)
        };

        System.out.println("\nSorted by Quick Sort (High to Low):");
        SortUtility.quickSort(orders, 0, orders.length - 1);
        SortUtility.displayOrders(orders);
    }
}

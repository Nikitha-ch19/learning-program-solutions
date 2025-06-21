public class TestEmployee {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Add employees
        manager.addEmployee(new Employee("E101", "Riya", "Manager", 60000));
        manager.addEmployee(new Employee("E102", "Amit", "Developer", 45000));
        manager.addEmployee(new Employee("E103", "Sara", "Designer", 40000));

        // List all
        manager.listAllEmployees();

        // Search
        System.out.println("\nSearching for E102:");
        Employee e = manager.searchById("E102");
        System.out.println(e != null ? e : "Not found");

        // Delete
        System.out.println("\nDeleting E101:");
        manager.deleteById("E101");

        // List again
        System.out.println("\nAfter deletion:");
        manager.listAllEmployees();
    }
}

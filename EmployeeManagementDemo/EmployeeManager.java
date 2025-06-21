public class EmployeeManager {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void addEmployee(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
        } else {
            System.out.println("Array full, can't add more employees.");
        }
    }

    public Employee searchById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId.equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void deleteById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId.equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Deleted employee with ID: " + id);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void listAllEmployees() {
        System.out.println("Employee Records:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}

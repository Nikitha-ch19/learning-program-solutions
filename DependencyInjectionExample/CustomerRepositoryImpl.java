public class CustomerRepositoryImpl implements CustomerRepository {
    public Customer findCustomerById(String id) {
        // Hardcoded example
        return new Customer(id, "Nikitha");
    }
}

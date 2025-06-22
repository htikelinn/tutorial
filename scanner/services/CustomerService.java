package scanner.services;

import scanner.dto.Customer;

public class CustomerService {
    //
    Customer customer;
    String description;

    public CustomerService(Customer customer, String description) {
        this.customer = customer;
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDescription() {
        return description;
    }
    // Constructor with args and getter setter
}
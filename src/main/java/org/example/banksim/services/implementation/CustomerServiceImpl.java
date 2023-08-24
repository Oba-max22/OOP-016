package org.example.banksim.services.implementation;

import org.example.banksim.models.Customer;
import org.example.banksim.services.CustomerService;

import static org.example.banksim.services.implementation.StaffServiceImpl.complaints;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public String withdrawFunds(Customer customer, Double amount) {

        if (customer.getBalance() < amount) {
            return "Insufficient Balance!";
        }

        Double newBalance = customer.getBalance() - amount;
        customer.setBalance(newBalance);

        return customer.getFirstName() + ", your new balance is:\n" + customer.getBalance();
    }

    @Override
    public String depositFunds(Customer customer, Double amount) {
        Double newBalance = customer.getBalance() + amount;
        customer.setBalance(newBalance);
        return customer.getFirstName() + ", your new balance is:\n" + customer.getBalance();
    }

    @Override
    public String layComplaints(Customer customer, String complaint) {
        complaints.put(customer, complaint);
        return "Complaint reported successfully!";
    }
}

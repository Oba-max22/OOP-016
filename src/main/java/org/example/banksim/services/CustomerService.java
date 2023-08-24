package org.example.banksim.services;

import org.example.banksim.models.Customer;
import org.example.banksim.models.User;

public interface CustomerService {

    String withdrawFunds(Customer customer, Double amount);
    String depositFunds(Customer customer, Double amount);
    String layComplaints(Customer customer, String complaint);
}

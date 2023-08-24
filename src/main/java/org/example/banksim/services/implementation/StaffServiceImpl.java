package org.example.banksim.services.implementation;

import org.example.banksim.enums.Role;
import org.example.banksim.models.Customer;
import org.example.banksim.models.User;
import org.example.banksim.services.StaffService;

import java.util.*;

public class StaffServiceImpl implements StaffService {

    public static Map<Customer, String> complaints = new LinkedHashMap<>();

    @Override
    public String addressComplaints(User customerService) {
        if (!customerService.getRole().equals(Role.STAFF_CUSTOMER_SERVICE)) {
            throw new RuntimeException("Unauthorized Access for user : " + customerService.getFirstName());
        }

        for (Map.Entry<Customer, String> entry : complaints.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        return "Complaints addressed!";
    }

}

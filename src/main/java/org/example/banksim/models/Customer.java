package org.example.banksim.models;

import lombok.Getter;
import lombok.Setter;
import org.example.banksim.enums.Role;

@Getter
@Setter
public class Customer extends User {

    private Double balance;

    public Customer(String email, String firstName, String lastName, Role role) {
        super(email, firstName, lastName, role);
        this.balance = 0.0;
    }
}

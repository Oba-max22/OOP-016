package org.example.banksim.models;

import lombok.Data;
import org.example.banksim.enums.Role;


@Data
public class User {

    public static int count = 0;

    private int userId;

    private String email;

    private String firstName;

    private String lastName;

    private Role role;

    public User(String email, String firstName, String lastName, Role role) {
        this.userId = count;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        count++;
    }
}

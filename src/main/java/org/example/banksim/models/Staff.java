package org.example.banksim.models;

import org.example.banksim.enums.Role;

public class Staff extends User {

    private int strikes;

    public Staff(String email, String firstName, String lastName, Role role, int strikes) {
        super(email, firstName, lastName, role);
        this.strikes = strikes;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }
}

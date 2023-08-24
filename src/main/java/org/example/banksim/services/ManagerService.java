package org.example.banksim.services;

import org.example.banksim.models.Candidate;
import org.example.banksim.models.Staff;
import org.example.banksim.models.User;

public interface ManagerService {

    String hireStaff(User manager, Candidate candidate);

    String fireStaff( User manager, Staff staff);
}

package org.example.banksim.services.implementation;

import org.example.banksim.enums.Role;
import org.example.banksim.models.Candidate;
import org.example.banksim.models.Staff;
import org.example.banksim.models.User;
import org.example.banksim.services.ManagerService;

public class ManagerServiceImpl implements ManagerService {

    private static void validateManagerAccess(User manager) {
        if (!manager.getRole().equals(Role.MANAGER)) {
            throw new RuntimeException("Unauthorized Access for user : " + manager.getFirstName());
        }
    }

    @Override
    public String hireStaff(User manager, Candidate candidate) {

        validateManagerAccess(manager);

        if (candidate.hasCompletedNYSC()
                && (candidate.getAge() >= 20 && candidate.getAge() <= 30)
                && candidate.getYearsOfExperience() >= 3) {
            return "Dear " + candidate.getFirstName() + "\n" +
                    "Congratulations! \n" +
                    "We are glad to inform you that have been employed. " +
                    "Please check emails regularly for onboarding resources.";
        }

        return "Dear " + candidate.getFirstName() + "\n" +
                "Unfortunately, we would be progressing with other candidates. \n" +
                "It's not you, it's us." +
                "Best Regards \n" + "Bank Recruitment";
    }

    @Override
    public String fireStaff(User manager, Staff staff) {

        validateManagerAccess(manager);

        if(staff.getStrikes() > 3) {
            return staff.getFirstName() + " has been fired!";
        }

        return staff.getFirstName() + " has been pardoned!";
    }

}

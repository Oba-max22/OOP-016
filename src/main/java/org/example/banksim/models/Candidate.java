package org.example.banksim.models;

import org.example.banksim.enums.Degree;
import org.example.banksim.enums.Role;


public class Candidate extends User {

    private Boolean completedNYSC;
    private Degree degree;
    private Integer age;
    private Integer yearsOfExperience;

    public Candidate(String email, String firstName, String lastName, Role role, Boolean completedNYSC, Degree degree, Integer age, Integer yearsOfExperience) {
        super(email, firstName, lastName, role);
        this.completedNYSC = completedNYSC;
        this.degree = degree;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean hasCompletedNYSC() {
        return completedNYSC;
    }

    public void setHasCompletedNYSC(boolean completedNYSC) {
        this.completedNYSC = completedNYSC;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}

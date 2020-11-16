package com.sparta.chris.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String namePrefix;
    private String firstName;
    private char middleName;
    private String lastName;
    private char gender;
    private String email;
    private Date dateOfBirth;
    private Date joinDate;
    private int salary;

    public void createEmployee(String[] employeeData) {
        this.namePrefix = employeeData[1];
        this.firstName = employeeData[2];
        this.middleName = employeeData[3].charAt(0);
        this.lastName = employeeData[4];
        this.gender = employeeData[5].charAt(0);
        this.email = employeeData[6];
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(employeeData[7]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            this.joinDate = new SimpleDateFormat("dd/MM/yyyy").parse(employeeData[8]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.salary = Integer.parseInt(employeeData[9]);
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public int getSalary() {
        return salary;
    }
}

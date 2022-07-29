package com.example.employeemanagementsystem.employee;

import javax.persistence.*;
//
//@Entity
//@Table
public class Employee {
//    @Id
//    @SequenceGenerator(
//            name="employee-sequence",
//            sequenceName = "employee-sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "employee-sequence"
//    )
    private long id;
    private double wage;
    private String name;
    private String email;
    private String position;

    public Employee(double wage, String name, String email, String position) {
        this.wage = wage;
        this.name = name;
        this.email = email;
        this.position = position;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", wage=" + wage +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

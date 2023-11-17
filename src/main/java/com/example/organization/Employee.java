package com.example.organization;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.position = "engineer";
        this.salary = 30000.00;
    }
    public Employee(String name, String surname, String position, double salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}

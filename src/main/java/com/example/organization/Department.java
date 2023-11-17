package com.example.organization;
import java.util.Arrays;

public class Department {
    private String name;
    private Employee[] employees;

    public Department(String name) {
        this.name = name;
        this.employees = new Employee[0];
    }
    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeesCount() {
        return employees.length;
    }
    public double getSalarySum() {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public Employee getEmployeeReference(String name, String surname) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
                return employee;
            }
        }
        return null;
    }

    public void removeEmployee(String name, String surname){
        int idx = -1;
        for(int i = 0; i < getEmployeesCount(); i++){
            Employee employee = employees[i];
            if(employee.getName().equals(name) && employee.getSurname().equals(surname)){
                idx = i;
                break;
            }
        }

        if(idx != -1){
            Employee[] newEmployees = new Employee[employees.length - 1];
            int index = 0;
            for(int i = 0; i < getEmployeesCount(); i++){
                if(i != idx){
                    newEmployees[index++] = employees[i];
                }
            }
            employees = newEmployees;
        }
    }
    public void addEmployee(Employee employee){
        Employee[] newEmployees = Arrays.copyOf(employees, getEmployeesCount() + 1);
        newEmployees[getEmployeesCount()] = employee;
        employees = newEmployees;
    }
    public Employee[] getEmployees() {
        return employees;
    }
    public Employee[] getEmployeesSorted() {
        Employee[] sortedEmployees = Arrays.copyOf(employees, getEmployeesCount());
        Arrays.sort(sortedEmployees, (e1, e2) -> {
            int compareSurnames = e1.getSurname().compareTo(e2.getSurname());
            if (compareSurnames == 0) {
                return e1.getName().compareTo(e2.getName());
            }
            return compareSurnames;
        });
        return sortedEmployees;
    }









}

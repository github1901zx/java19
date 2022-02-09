package com.popov.spring.mvc;
import java.util.HashMap;
import java.util.Map;

public class Employye {
    private String name;
    private String surName;
    private int salary;
    private String department;
    private Map<String,String> departments;

    public Employye() {
        departments = new HashMap<>();
        departments.put("IT","Information technology");
        departments.put("HR","Human resourse");
        departments.put("Sales","Sales");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employye{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + departments + '\'' +
                '}';
    }
}

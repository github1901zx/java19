package com.popov.spring.mvc_hibernate_aop.service;

import com.popov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployees(Employee employee);
    public Employee getEmployees(int id);
    public void delEmployees(int id);
}

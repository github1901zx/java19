package com.popov.spring.mvc_hibernate_aop.dao;

import com.popov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployyes();
    public void saveEmployees(Employee employee);
    public Employee getEmployees(int id);
    public void delEmployees(int id);
}

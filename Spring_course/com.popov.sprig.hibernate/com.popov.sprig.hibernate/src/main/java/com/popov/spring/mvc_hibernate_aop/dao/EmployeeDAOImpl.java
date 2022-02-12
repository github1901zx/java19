package com.popov.spring.mvc_hibernate_aop.dao;

import com.mysql.cj.Query;
import com.popov.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    @Transactional
    public List<Employee> getAllEmployyes() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmp = session.createQuery("from Employee"
                ,Employee.class).getResultList();
        return allEmp;
    }

    @Override
    @Transactional
    public void saveEmployees(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    @Transactional
    public Employee getEmployees(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    @Transactional
    public void delEmployees(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete Employee where id =" + id).executeUpdate();
    }
}

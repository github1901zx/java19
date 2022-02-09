package hibernate_test;

import hibernate_test.entity.Department;
import hibernate_test.entity.Ditails;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Ditails.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            Department department = new Department("IT",1500,500);
            Employee employee1 = new Employee("Vladimir","Dada",1000,"IT");
            Employee employee2 = new Employee("LeV","cHEMP",500,"SYETOLOG");
            department.addEmp(employee1);
            department.addEmp(employee2);
            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}

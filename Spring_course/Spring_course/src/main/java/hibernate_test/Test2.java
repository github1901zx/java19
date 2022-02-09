package hibernate_test;

import hibernate_test.entity.Ditails;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("appContextHiber.xml");
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Ditails.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
//            Employee employee = new Employee("Valera","Olennik",910,"IT");
//            Ditails ditails = new Ditails("New-York","yaqw@gmail.com","+74951113355");
//
//            session.beginTransaction();
//            ditails.setEmployee(employee);
//            session.save(ditails);
//            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}

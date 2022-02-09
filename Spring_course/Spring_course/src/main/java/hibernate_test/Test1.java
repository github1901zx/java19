package hibernate_test;

import hibernate_test.entity.Ditails;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("appContextHiber.xml");

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Ditails.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
//            session.save(employee);

//            Employee empSave = session.get(Employee.class,employee.getId());
//            System.out.println(empSave.toString());

//            List<Employee> employeesList = session.createQuery("from Employee").getResultList();
//            List<Employee> employeesList = session.createQuery("from Employee " +
//                    "where name = 'vlad'").getResultList();
//            System.out.println(employeesList);

//            Employee empSave = new Employee("vasa","gold",100,"CLEAN");
////            empSave.setSalary(10000);
//            Ditails ditails = new Ditails("London","london@gmail.com","+111");
//            empSave.setDitails(ditails);
//            ditails.setEmployee(empSave);
//            session.save(ditails);
            session.createQuery("update Employee set salary=1000 " +
                    " where name='Vlad'").executeUpdate();
            session.getTransaction().commit();
    }
        finally {
            session.close();
            factory.close();
        }

    }
}

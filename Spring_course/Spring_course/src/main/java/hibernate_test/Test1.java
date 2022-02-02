package hibernate_test;

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

//        Employee employee = context.getBean("employeeBean", Employee.class);
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

//        Employee employee = new Employee("Vlad","Nabi",1800,"IT");
        try {
            session.beginTransaction();
//            session.save(employee);

//            Employee empSave = session.get(Employee.class,employee.getId());
//            System.out.println(empSave.toString());

//            List<Employee> employeesList = session.createQuery("from Employee").getResultList();
//            List<Employee> employeesList = session.createQuery("from Employee " +
//                    "where name = 'vlad'").getResultList();
//            System.out.println(employeesList);

            Employee empSave = session.get(Employee.class,6);
//            empSave.setSalary(10000);

            session.createQuery("update Employee set salary=999 " +
                    " where name='Vlad'").executeUpdate();
        }
        finally {
            session.getTransaction().commit();
            factory.close();
        }

    }
}

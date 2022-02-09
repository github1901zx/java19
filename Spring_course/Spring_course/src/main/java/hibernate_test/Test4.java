package hibernate_test;

import hibernate_test.entity.Child;
import hibernate_test.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = sessionFactory.getCurrentSession();

//            Section section = new Section("Football");
//            Child child = new Child("Dima",5);
//            Child child1 = new Child("Anderi",4);
//            Child child2 = new Child("Egor",6);
//            section.addChild(child);
//            section.addChild(child1);
//            section.addChild(child2);

//            child.addSection(section);
//            child1.addSection(section);
//            child2.addSection(section);
            session.beginTransaction();
//            session.save(section);
//            session.persist(child);
//            session.persist(child1);
//            session.persist(child2);

            Child childdel = session.get(Child.class,2);
            session.delete(childdel);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}

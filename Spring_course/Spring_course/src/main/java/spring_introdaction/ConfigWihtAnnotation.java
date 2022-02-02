package spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWihtAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext2.xml");

//        Pet pet = context.getBean("catBean",Cat.class);
        Person person = context.getBean("personBean",Person.class);
        person.callPet();
        System.out.println(person.getSurName());
        System.out.println(person.getName());

        context.close();

    }
}

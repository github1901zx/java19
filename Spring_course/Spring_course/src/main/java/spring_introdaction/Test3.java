package spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson",Person.class);
        person.callPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSurName());

        Cat pet1 = context.getBean("catBean",Cat.class);
        Cat pet2 = context.getBean("catBean",Cat.class);
        pet1.voice();
        pet2.voice();
        context.close();
    }
}

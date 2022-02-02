package spring_introdaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Cat pet1 = context.getBean("catBean",Cat.class);
//        Cat pet2 = context.getBean("catBean",Cat.class);
//        pet1.voice();
//        pet2.voice();

        Person person = context.getBean("personBean",Person.class);
        person.callPet();
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getSurName() );
        context.close();
    }
}

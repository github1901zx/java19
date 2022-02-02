package spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContex.xmll");
        Pet dog = context.getBean("myPet", Pet.class);
        dog.voice();
        context.close();
    }
}

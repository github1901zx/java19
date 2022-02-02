package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Libary libary = context.getBean("libaryBean",Libary.class);
        libary.getBook();
        libary.addBook("Book");
        context.close();

    }

}

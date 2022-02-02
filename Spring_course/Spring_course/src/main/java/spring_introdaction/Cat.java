package spring_introdaction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("catBean")
//@Scope("prototype")
public class Cat implements Pet{

    public Cat (){
        System.out.println("Cat create");
    }

    @Override
    public void voice() {
        System.out.println("may may");
    }
}

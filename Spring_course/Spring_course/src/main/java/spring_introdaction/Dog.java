package spring_introdaction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet{
    public Dog(){
        System.out.println("Dog create");
    }
    @Override
    public void voice(){
        System.out.println("voy voy");
    }
}

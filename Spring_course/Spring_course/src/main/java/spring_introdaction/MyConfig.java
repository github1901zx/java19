package spring_introdaction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("spring_introdaction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Person personBean(){
        return new Person(catBean());
    }
}

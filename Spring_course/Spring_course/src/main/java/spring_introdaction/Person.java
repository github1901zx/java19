package spring_introdaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
@Scope("prototype")
public class Person {
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.surname}")
    private String surName;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person create");
    }

    public Person(Pet pet) {
        System.out.println("Person create");
        this.pet = pet;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callPet(){
        System.out.println("Hi my pet ");
        pet.voice();
    }

    public Pet getPet() {
        return pet;
    }

//    @Autowired
//    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("pet set");
        this.pet = pet;
    }
}

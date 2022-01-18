package lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Students {
    private String name;
    private int age;
    private char sex;

    public Students() {

    }

    public Students(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && sex == students.sex && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public static void filterStudents(ArrayList<Students> stdList, Predicate<Students> predicate) {
        for (Students val : stdList) {
            if (predicate.test(val)) {
                System.out.println(val.toString());
            }
        }
    }

    public static ArrayList<Students> supplierStudents(Supplier<Students> supplier, int size) {
        ArrayList<Students> studentsArrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            studentsArrayList.add(supplier.get());
        }
        return studentsArrayList;
    }

    public static void consumerStudent(Students student, Consumer<Students> consumer) {
        consumer.accept(student);
    }

    public static double avgAgeStudents(List<Students> studentsList, Function<Students, Double> function) {
        double res = 0;
        for (Students s : studentsList) {
            res = res + function.apply(s);
        }
        return res / studentsList.size();
    }
}
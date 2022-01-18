package lambda;

import java.util.ArrayList;

public class PredicateClass {
    public static void main(String[] args) {
        Students st1 = new Students("Irina",20,'f');
        Students st2 = new Students("Oleg",25,'m');
        Students st3 = new Students("Elena",22,'f');
        Students st4 = new Students("Olga",22,'f');
        Students st5 = new Students("Ivan",21,'m');

        ArrayList<Students> stdList = new ArrayList<>();

        stdList.add(st1);
        stdList.add(st2);
        stdList.add(st3);
        stdList.add(st4);
        stdList.add(st5);

        Students.filterStudents(stdList, student -> student.getAge() < 25);
        System.out.println("-----------------------------------------------");
        Students.filterStudents(stdList, student -> student.getSex() == 'f');


    }
}

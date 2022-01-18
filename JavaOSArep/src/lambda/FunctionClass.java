package lambda;

import java.util.ArrayList;

public class FunctionClass {
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

        double avg = 0;
        avg=Students.avgAgeStudents(stdList,students -> (double)students.getAge());
        System.out.println(avg);



    }
}

package lambda;

import java.util.ArrayList;

public class ConsumerClass {
    public static void main(String[] args) {
        ArrayList<Students> stdList = Students.supplierStudents(()->new Students("name",19,'a'),3);
        System.out.println(stdList);

        Students.consumerStudent(stdList.get(0),students -> {students.setName("ivan"); students.setAge(21);students.setSex('m');});
        System.out.println(stdList);

    }
}

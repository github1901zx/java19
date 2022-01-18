package lambda;

import java.util.ArrayList;

public class SupplierClass {
    public static void main(String[] args){
        ArrayList<Students> stdList = Students.supplierStudents(()->new Students("name",19,'a'),3);
        System.out.println(stdList);
    }
}

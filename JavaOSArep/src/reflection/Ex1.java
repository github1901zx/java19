package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class empClass= Class.forName("reflection.Employee");
//        Class empClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class empClass3 = emp.getClass();

        System.out.println("----------------------------Fields");

        Field[] fields = empClass.getFields();

        for (Field f:fields) {
            System.out.print("Fields name " + f.getName());
            System.out.println(" Fields type " + f.getType()+";");
        }
        System.out.println("*****************************************");

        Field[] fields2 = empClass.getDeclaredFields();

        for (Field f:fields2) {
            System.out.print("Fields name " + f.getName());
            System.out.println(" Fields type " + f.getType()+";");
        }
        System.out.println("----------------------------Method");

        Method[] methods = empClass.getMethods();

        for (Method m:methods) {
            System.out.print("Method name " + m.getName());
            System.out.print(" Method type " + Arrays.toString(m.getParameterTypes())+";");
            System.out.println("Method Return type " + m.getReturnType()+";");
        }
        System.out.println("*****************************************");

        Method[] methods2 = empClass.getDeclaredMethods();

        for (Method m:methods2) {
            System.out.print("Method name " + m.getName());
            System.out.print(" Method type " + Arrays.toString(m.getParameterTypes())+";");
            System.out.println(" Method Return type " + m.getReturnType()+";");
        }

        System.out.println("----------------------------Constructor");

        Constructor[] constructors = empClass.getDeclaredConstructors();

        for (Constructor c:constructors){
            System.out.print("Constructor name " + c.getName());
            System.out.println(" Constructor type " + Arrays.toString(c.getParameterTypes()));
        }
    }


}

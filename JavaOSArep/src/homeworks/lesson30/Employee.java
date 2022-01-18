package homeworks.lesson30;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class TestEmployee {
//    public void printEmployee(Employee e) {
//        e.toString();
//    }

    public static void filtraciaRabotnikov(ArrayList<Employee> employees, Predicate<Employee> predicateEmp){
        for (Employee w: employees) {
            if(predicateEmp.test(w)){
                System.out.println(w.toString());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> arrEmp =  new ArrayList<>();
        Employee e1=new Employee("vasa","it",300);
        Employee e2=new Employee("petr","manager",50);
        Employee e3=new Employee("vlad","clining",150);
        Employee e4=new Employee("   e v  G   E n  ","it",250);

        arrEmp.add(e1);
        arrEmp.add(e2);
        arrEmp.add(e3);
        arrEmp.add(e4);


        TestEmployee.filtraciaRabotnikov(arrEmp,(Employee e) -> e.getDepartment().equals("it") && e.getSalary() > 200);
        System.out.println("_______________________________1");
        TestEmployee.filtraciaRabotnikov(arrEmp,(Employee e) -> e.getName().trim().toLowerCase(Locale.ROOT).startsWith("e") && e.getSalary() != 450);
        System.out.println("_______________________________2");
        TestEmployee.filtraciaRabotnikov(arrEmp,(Employee e) -> e.getName().equals(e.getDepartment().equals("it")));

        Predicate<Employee> p1 = employee -> employee.getDepartment().equals("it");
        Predicate<Employee> p2 = employee -> employee.getSalary() < 1000;
        System.out.println("_______________________________and");
        TestEmployee.filtraciaRabotnikov(arrEmp, p1.and(p2));
        System.out.println("_______________________________or");
        TestEmployee.filtraciaRabotnikov(arrEmp, p1.or(p2));
        System.out.println("_______________________________negate");
        TestEmployee.filtraciaRabotnikov(arrEmp, p1.negate());

    }
}

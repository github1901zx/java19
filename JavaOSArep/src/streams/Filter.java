package streams;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filter {
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


        ArrayList<Employee> arrEmpIt =  (ArrayList<Employee>) arrEmp.stream().filter(employee -> employee.getDepartment().equals("it")).collect(Collectors.toList());
        arrEmp.forEach(e -> System.out.println(e));
        System.out.println("-----------------------------");
        System.out.println(arrEmpIt);
    }
}



class Employee {
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
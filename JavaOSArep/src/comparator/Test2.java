package comparator;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "ivan", "sokolov", 1000);
        Employee emp2 = new Employee(2, "petr", "sokolov", 9000);
        Employee emp3 = new Employee(3, "ila", "molokov", 300);
        Employee emp4 = new Employee(4, "dima", "dorohov", 2000);
        Employee emp5 = new Employee(5, "goga", "lopyhov", 10000);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        System.out.println(list);
        System.out.println("----------------------------");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("------------------------------");
        Collections.sort(list, new nameComparator());
        System.out.println(list);
        System.out.println("------------------------------");
        Collections.sort(list, new salaryComparator());
        System.out.println(list);
        System.out.println("------------------------------");
    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, salary);
    }

    @Override
    public String toString() {
        return "Employee " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ' ';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id == o.id) {
            return 0;
        } else if (this.id > o.id) {
            return 1;
        } else {
            return -1;
        }
////        return this.id-o.id;
////       return this.id.compareTo(o.id); if -> private Integer id
////        return this.name.compareTo(o.name);
////
////        int res = this.name.compareTo(o.name);
////        if(res == 0){
////            res = this.surname.compareTo(o.surname);
////        }
////        return res;
    }
}

class idComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() == o2.getId()) {
            return 0;
        } else if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
class nameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class surNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}

class salaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()-o2.getSalary();
    }
}
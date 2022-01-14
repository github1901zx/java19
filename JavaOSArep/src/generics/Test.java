package generics;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("s1",10);
        Schoolar schoolar2 = new Schoolar("s2",11);

        Student student1 = new Student("stud1",20);
        Student student2 = new Student("stud2",18);

        Employee employee1 = new Employee("em1",30);
        Employee employee2 = new Employee("em2",26);

        Team<Schoolar> team1 = new Team("Sc");
        Team<Student> team2 = new Team("St");
        Team<Employee> team3 = new Team("Em");
        Team<Schoolar> team4 = new Team("teatTeam");

        team1.addPartsm(schoolar1);
        team1.addPartsm(schoolar2);
        team2.addPartsm(student1);
        team2.addPartsm(student2);
        team3.addPartsm(employee1);
        team3.addPartsm(employee2);

        team1.playTeam(team4);


    }
}

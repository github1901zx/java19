package hibernate_test.entity;

import javax.persistence.*;
import java.util.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "dep_id")
    private int id;
    @Column (name = "dep_name")
    private String depName;
    @Column (name = "dep_maxaSalary")
    private int maxSalary;
    @Column (name = "dep_minSalary")
    private int minSalary;
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH}
            ,mappedBy = "departmentToMany")
    private List<Employee> depEmp;

    public Department(){

    }

    public Department(String depName, int maxSalary, int minSalary) {
        this.depName = depName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmp(Employee employee){
        if(depEmp == null){
            depEmp = new ArrayList<>();
        }
        depEmp.add(employee);
        employee.setDepartmentToMany(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getDepEmp() {
        return depEmp;
    }

    public void setDepEmp(ArrayList<Employee> depEmp) {
        this.depEmp = depEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id && maxSalary == that.maxSalary && minSalary == that.minSalary && Objects.equals(depName, that.depName) && Objects.equals(depEmp, that.depEmp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, depName, maxSalary, minSalary, depEmp);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                ", depEmp=" + depEmp +
                '}';
    }
}

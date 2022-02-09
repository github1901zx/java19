package hibernate_test.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ditails")
public class Ditails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dit")
    private int id;
    @Column(name = "city_dit")
    private String city;
    @Column(name = "email_dit")
    private String email;
    @Column(name = "phone_dit")
    private String phone;



    @OneToOne(mappedBy = "ditails",cascade = CascadeType.ALL)
    private Employee employee;

    public Ditails() {
    }

    public Ditails(String city, String email, String phone) {
        this.city = city;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ditails ditails = (Ditails) o;
        return id == ditails.id && Objects.equals(city, ditails.city) && Objects.equals(email, ditails.email) && Objects.equals(phone, ditails.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, email, phone);
    }

    @Override
    public String toString() {
        return "Ditails{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

package database;


import entity.Discepline;
import entity.Group;
import entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager {

    public static ArrayList<Student> getAllActiveStudent() {
        String url = "jdbc:mysql://localhost:7777/students_java_19";
        String user = "root";
        String password = "root19011994";
        ArrayList<Student> students = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT student.lastname,student.name,group.name as grp,student.date FROM student LEFT JOIN `group` on `group`.id = student.id_group;");

            while (rs.next()) {
                Student student = new Student();
                Group group = new Group();
                student.setLastname(rs.getString("lastname"));
                student.setName(rs.getString("name"));
                student.setDate(rs.getDate("date"));
                group.setName(rs.getString("grp"));
                student.setGroup(group);
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static Discepline getDisceplineById(String id) {
        String url = "jdbc:mysql://localhost:7777/students_java_19";
        String user = "root";
        String password = "root19011994";
        Discepline discepline = new Discepline();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from students_java_19.discipline where id = '" + id + "';");

            while (rs.next()) {
                discepline.setDiscipline(rs.getString("discipline"));
                discepline.setId(rs.getInt("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return discepline;
    }

    public static ArrayList<Discepline> getAllActiveDisceplines() {
        String url = "jdbc:mysql://localhost:7777/students_java_19";
        String user = "root";
        String password = "root19011994";
        ArrayList<Discepline> disceplines = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from `discipline` where `status` = '1';");

            while (rs.next()) {
                Discepline discepline = new Discepline();
                discepline.setDiscipline(rs.getString("discipline"));
                discepline.setId(rs.getInt("id"));
                disceplines.add(discepline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disceplines;
    }

    public static void createDiscepline(String disc) {

        String url = "jdbc:mysql://localhost:7777/students_java_19";
        String user = "root";
        String password = "root19011994";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url, user, password);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO `discipline` (`discipline`, `status`) VALUES ('" + disc + "', '1');");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteDiscepline(String p) {

        String url = "jdbc:mysql://localhost:7777/students_java_19";
        String user = "root";
        String password = "root19011994";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url, user, password);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `status`=  '0' WHERE id in ("+ p +");");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void modifyDiscepline(String id, String name) {

        String url = "jdbc:mysql://localhost:7777/students_java_19";
        String user = "root";
        String password = "root19011994";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url, user, password);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `discipline` =  ('"+ name +"') WHERE id = ('"+ id +"');");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}

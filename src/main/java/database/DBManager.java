package database;


import constants.Constants;
import entity.Discepline;
import entity.Group;
import entity.Student;
import entity.Term;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager {

    public static ArrayList<Student> getAllActiveStudent() {

//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";

        ArrayList<Student> students = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
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

//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";

        Discepline discepline = new Discepline();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
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
//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";
        ArrayList<Discepline> disceplines = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from `discipline` where `status` = '1' order by `discipline` ;");

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

//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO `discipline` (`discipline`, `status`) VALUES ('" + disc + "', '1');");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteDiscepline(String p) {

//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `status`=  '0' WHERE id in ("+ p +");");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void modifyDiscepline(String id, String name) {

//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `discipline` =  ('"+ name +"') WHERE id = ('"+ id +"');");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createStudent(String lastname,String name,String idGrp,String date,String status) {

//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO `students_java_19`.`student` (`lastname`, `name`, `id_group`, `date`, `status`) " +
                    "VALUES (('"+ lastname +"'), ('"+ name +"'), ('"+ idGrp +"'), ('"+ date +"'), ('"+ status +"'));");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Group> getAllGroup() {
//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";
        ArrayList<Group> groups = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_java_19.`group`;");

            while (rs.next()) {
                Group group = new Group();
                group.setId(rs.getInt("id"));
                group.setName(rs.getString("name"));
                groups.add(group);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return groups;
    }

    public static ArrayList<Term> getAllActiveTerms() {
//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";
        ArrayList<Term> terms = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from `term` where `status` = '1';");

            int count = 1;
            while (rs.next()) {
                Term term = new Term();
                term.setId(rs.getInt("id"));
                term.setName("Семестр" + count);
                count++;
                term.setDuration(rs.getString("duration"));
                terms.add(term);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return terms;
    }

    public static ArrayList<Discepline> getAllActiveDisceplinesByTerm(int idTerm) {
//        String url = "jdbc:mysql://localhost:7777/students_java_19";
//        String user = "root";
//        String password = "root19011994";
        ArrayList<Discepline> disceplines = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (Constants.url, Constants.user, Constants.password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "SELECT d.id, d.discipline FROM term_discipline as td\n" +
                    "left join discipline as d on td.id_discipline = d.id \n" +
                    "where td.id_term='"+idTerm+"'\n" +
                    "and d.status='1';");

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


}

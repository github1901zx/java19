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
        String url ="jdbc:mysql://localhost:7777/students_java_19";
        String user ="root";
        String password ="root19011994";
        ArrayList<Student> students = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select lastname,name,id from student;");

            while (rs.next()){
                Student student = new Student();
                student.setLastname(rs.getString("lastname"));
                student.setName(rs.getString("name"));
                student.setId(rs.getInt("id"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static ArrayList<Discepline> getAllActiveDisceplines(){
        String url ="jdbc:mysql://localhost:7777/students_java_19";
        String user ="root";
        String password ="root19011994";
        ArrayList<Discepline> disceplines = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from `discipline` where `status` = '1';");

            while (rs.next()){
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

    public static void createDiscepline (String disc){

        String url ="jdbc:mysql://localhost:7777/students_java_19";
        String user ="root";
        String password ="root19011994";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url,user,password);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO `discipline` (`discipline`, `status`) VALUES ('"+disc+"', '1');");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

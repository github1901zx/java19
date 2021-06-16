package database;


import entity.Discepline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager {
//    public static void main(String[] args) {
//        String url ="jdbc:mysql://localhost:7777/students_java_19";
//        String user ="root";
//        String password ="root19011994";
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection
//                    (url,user,password);
//            System.out.println("База");
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from `discipline`");
//            while (rs.next()){
//                System.out.print(rs.getInt("id")+"-");
//                System.out.print(rs.getString("discipline")+"-");
//                System.out.print(rs.getInt("status"));
//                System.out.println();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static ArrayList<Discepline> getAllActiveDisceplines(){
        String url ="jdbc:mysql://localhost:7777/students_java_19";
        String user ="root";
        String password ="root19011994";
        ArrayList<Discepline> disceplines = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection
                    (url,user,password);
            System.out.println("База присоеденилась");
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
            System.out.println("База присоеденилась");
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO `discipline` (`discipline`, `status`) VALUES ('"+disc+"', '1');");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

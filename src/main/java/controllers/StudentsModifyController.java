package controllers;

import database.DBManager;
import entity.Group;
import entity.Student;
import filtres.DataFilter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "StudentsModifyController", urlPatterns = "/students-modify")
public class StudentsModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("hiddenModify");
        Student student = DBManager.getStudent(id);
        ArrayList<Group> groups = DBManager.getAllGroup();
        req.setAttribute("stud", student);
        req.setAttribute("groups", groups);
        req.getRequestDispatcher("WEB-INF/jsp/student-modify.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("idstd");
        String lastname = req.getParameter("lastname");
        String name = req.getParameter("name");
        String group = req.getParameter("group");
        String dateFromUser = req.getParameter("date");
        String dateDbFinal = DataFilter.data(dateFromUser);


//        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
//        Date date = null;
//        try{
//            date = format.parse(dateFromUser);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
//        String dateDb = sdf.format(date);
//        System.out.println(dateDb);

        boolean m = false;
        if (lastname == null || lastname.equals("")) {
            req.setAttribute("massege", "error");
            m = true;
        }
        if (name == null || name.equals("")) {
            req.setAttribute("massege1", "error1");
            m = true;
        }
        if (group == null || group.equals("")) {
            req.setAttribute("massege2", "error2");
            m = true;
        }
        if (dateFromUser == null || dateFromUser.equals("")) {
            req.setAttribute("massege3", "error3");
            m = true;
        }
        if (m) {
            Student student = DBManager.getStudent(id);
            ArrayList<Group> groups = DBManager.getAllGroup();
            req.setAttribute("stud", student);
            req.setAttribute("groups", groups);
            req.getRequestDispatcher("WEB-INF/jsp/student-modify.jsp").forward(req, resp);
            return;
        }

        DBManager.modifyStudent(id, lastname, name, group, dateDbFinal);
        resp.sendRedirect("/students");
    }
}

package controllers;

import database.DBManager;
import entity.Group;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebServlet(name = "StudentsCreateController", urlPatterns = "/students-create")
public class StudentsCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Group> groups = DBManager.getAllGroup();
        req.setAttribute("groups",groups);
        req.getRequestDispatcher("WEB-INF/jsp/student-create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lastname = req.getParameter("lastname");
        String name = req.getParameter("name");
        String group = req.getParameter("group");

        String dateFromUser = req.getParameter("date");
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = null;
        try{
            date = format.parse(dateFromUser);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        String dateDb = sdf.format(date);
//        System.out.println(dateDb);
        String status ="1";
            boolean m = false;
            if(lastname == null || lastname.equals("")){
                req.setAttribute("massege","error");
                m = true;
            }
            if(name == null || name.equals("")){
                req.setAttribute("massege1","error1");
                m = true;
            }
            if(group == null || group.equals("")){
                req.setAttribute("massege2","error2");
                m = true;
            }
            if(date == null || date.equals("")){
                req.setAttribute("massege3","error3");
                m = true;
            }
            if(m){
                req.getRequestDispatcher("WEB-INF/jsp/student-create.jsp").forward(req,resp);
                return;
            }

        DBManager.createStudent(lastname,name,group,dateDb,status);
        resp.sendRedirect("/students");
    }

}

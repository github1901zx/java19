package controllers;

import database.DBManager;
import entity.Group;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "StudentsCreateController", urlPatterns = "/students-create")
public class StudentsCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Group> groups = DBManager.getAllGroup();
        req.setAttribute("groups",groups);
        req.getRequestDispatcher("WEB-INF/jsp/student-create.jsp").forward(req,resp);
    }

}

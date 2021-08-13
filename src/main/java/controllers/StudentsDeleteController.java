package controllers;

import database.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "StudentsDeleteController", urlPatterns = "/students-delete")
public class StudentsDeleteController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("hiddenDelete");
        DBManager.deleteStudents(id);
        resp.sendRedirect("/students");
    }
}

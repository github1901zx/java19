package controllers;

import database.DBManager;
import entity.Discepline;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="DisceplineModifyController" , urlPatterns = "/discipline-modify")
public class DisceplineModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("hiddenModify");
        Discepline disp = DBManager.getDisceplineById(id);
        req.setAttribute("disp",disp);
        req.getRequestDispatcher("WEB-INF/jsp/discepline-modify.jsp").forward(req,resp);

    }
}

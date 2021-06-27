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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("idModify");
        String disc = req.getParameter("discModify");

        if(disc == null || disc.equals("")){
            req.setAttribute("massege","error");
            Discepline disp = DBManager.getDisceplineById(id);
            req.setAttribute("disc",disp);
            req.getRequestDispatcher("WEB-INF/jsp/discepline-modify.jsp").forward(req,resp);
            return;
        }

        DBManager.modifyDiscepline(id,disc);
        resp.sendRedirect("/disceplines");
    }
}

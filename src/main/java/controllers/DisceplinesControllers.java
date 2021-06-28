package controllers;

import database.DBManager;
import entity.Discepline;
import services.CookieServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "DisceplinesControllers",urlPatterns = "/disceplines")
public class DisceplinesControllers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie [] cookies = req.getCookies();
        Cookie counter = CookieServices.getCookieByName(cookies,"counter");
        if(counter == null){
            counter = new Cookie("counter","1");
        }else{
            int value = Integer.parseInt(counter.getValue());
            value++;
            counter.setValue(value + "");
        }
        resp.addCookie(counter);

        ArrayList<Discepline> disceplines = DBManager.getAllActiveDisceplines();
        req.setAttribute("disceplines",disceplines);
        req.getRequestDispatcher("WEB-INF/jsp/disceplines.jsp").forward(req,resp);
    }
}

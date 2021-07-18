package controllers;

import database.DBManager;
import entity.Discepline;
import entity.Term;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "TermsController", urlPatterns = "/terms")
public class TermsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Term> terms = DBManager.getAllActiveTerms();
        Term selectedTerm = terms.get(0);
        ArrayList<Discepline> disceplines = DBManager.getAllActiveDisceplinesByTerm(selectedTerm.getId());
        req.setAttribute("terms",terms);
        req.setAttribute("selectedTerm",selectedTerm);
        req.setAttribute("disceplines",disceplines);
        req.getRequestDispatcher("WEB-INF/jsp/terms.jsp").forward(req,resp);
    }
}

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

@WebServlet (name = "TermsModifyController", urlPatterns = "/terms-modify")
public class TermsModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("idModify");
        ArrayList<Discepline> allDisceplines = DBManager.getAllActiveDisceplines();
        ArrayList<Discepline> disceplinesByTerm = DBManager.getAllActiveDisceplinesByTerm(Integer.parseInt(id));
        Term term = DBManager.getTermById(id);

        for (int i = 0; i < allDisceplines.size(); i++) {
            for(Discepline discByTerm: disceplinesByTerm){
                if(allDisceplines.get(i).getId() == discByTerm.getId()){
                    Discepline discNew = allDisceplines.get(i);
                    discNew.setSelected(true);
                    allDisceplines.set(i,discNew);
                }
            }
        }

        req.setAttribute("allDisceplines", allDisceplines);
        req.setAttribute("term", term);

        req.getRequestDispatcher("WEB-INF/jsp/term-modify.jsp").forward(req,resp);
    }
}

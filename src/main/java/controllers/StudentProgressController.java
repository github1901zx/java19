package controllers;

import database.DBManager;
import entity.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "StudentProgressController", urlPatterns ="/studentProgress")
public class StudentProgressController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("hiddenProg");
        Student student = DBManager.getStudent(id);
//        ArrayList<Group> groups = DBManager.getAllGroup();
        req.setAttribute("studProg", student);
//        req.setAttribute("groups", groups);

        String selected = req.getParameter("selected");
        ArrayList<Term> terms = DBManager.getAllActiveTerms();
        Term selectedTerm = null;

        if(selected == null|| selected.equals("")){
            selectedTerm= terms.get(0);
        }else{
            for (Term t : terms) {
                if(selected.equals(t.getId()+"")){
                    selectedTerm = t;
                }
            }
        }
        ArrayList<Mark> marks = DBManager.progresStudent(id,selectedTerm.getId());
        req.setAttribute("terms",terms);
        req.setAttribute("selectedTerm",selectedTerm);
        req.setAttribute("marks",marks);
//        req.setAttribute("disceplines",disceplines);
        req.getRequestDispatcher("WEB-INF/jsp/student-progres.jsp").forward(req,resp);
    }
}

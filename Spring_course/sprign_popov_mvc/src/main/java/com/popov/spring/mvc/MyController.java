package com.popov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFistView(){
        return "fist-view";
    }
    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model){
        model.addAttribute("employye", new Employye());
        return "ask-emp-detils";
    }
//    @RequestMapping("/showDetails")
//    public String showaskEmpDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("empName");
//        model.addAttribute("attributeName", "Mr. " + empName);
//        return "show-emp-detils";
//    }

    @RequestMapping("/showDetails")
    public String showAskEmpDetails(@ModelAttribute("employye") Employye emp){

        return "show-emp-detils";
    }
}

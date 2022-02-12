package com.popov.spring.mvc_hibernate_aop.controller;

import com.popov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.popov.spring.mvc_hibernate_aop.entity.Employee;
import com.popov.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/")
    public  String showAllEmployees(Model model){
         List<Employee> allEmployyes = employeeService.getAllEmployees();
        model.addAttribute("allEmps",allEmployyes);
        return "all-employees";
    }

    @RequestMapping("/addEmp")
    public String addEmployees(Model model){
        Employee employee =  new Employee();
        model.addAttribute("employee",employee);
        return "add-employees";
    }

    @RequestMapping("/saveEmp")
    public String saveEmp(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployees(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmp(@RequestParam("empId") int id, Model model){
        Employee employee = employeeService.getEmployees(id);
        model.addAttribute("employee",employee);
        return "add-employees";
    }

    @RequestMapping("/deleteEmp")
    public String deleteEmp(@RequestParam("empId") int id){
        employeeService.delEmployees(id);
        return "redirect:/";
    }

}

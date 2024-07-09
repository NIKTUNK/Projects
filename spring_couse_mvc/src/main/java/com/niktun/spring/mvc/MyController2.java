package com.niktun.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MyController2 {
    @RequestMapping("/")
    public String showFirstView()
    {
        return "first-view";
    }

    @RequestMapping("/askDetails")
public String askEmployeeDetails(Model model)
    {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view_2";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
            return "ask-emp-details-view_2";
        else
            return "show-emp-details-view_2";
//    public String showEmployeeDetails(HttpServletRequest request, Model model)
//    {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        String empNumber = request.getParameter("employeeNum");
//        int inn = Integer.parseInt(empNumber);
//        inn+=3;
//        model.addAttribute("description", inn);
    }
}
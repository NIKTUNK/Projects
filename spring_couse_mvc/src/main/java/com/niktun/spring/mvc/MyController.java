//package com.niktun.spring.mvc;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//public class MyController {
//    @RequestMapping("/")
//    public String showFirstView()
//    {
//        return "first-view";
//    }
//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails()
//    {
//        return "ask-emp-details-view";
//    }
////    @RequestMapping("showDetails")
////    public String showEmployeeDetails()
////    {
////        return "show-emp-details-view";
////    }
//
////    @RequestMapping("/showDetails")
////    public String showEmployeeDetails(HttpServletRequest request, Model model)
////    {
////        String empName = request.getParameter("employeeName");
////        empName = "Mr. " + empName;
////        model.addAttribute("nameAttribute", empName);
////        model.addAttribute("description", "- chto proishodit?");
////        return "show-emp-details-view";
////    }
//
////    @RequestMapping("/showDetails")
////    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model)
////    {
////
////        empName = "Mr. " + empName;
////        model.addAttribute("nameAttribute", empName);
////        return "show-emp-details-view";
////    }
//
//    @RequestMapping("/showDetails")
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
//        return "show-emp-details-view";
//    }
//}
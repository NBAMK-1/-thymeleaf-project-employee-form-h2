package com.example.project4.Controller;

import com.example.project4.Entities.Employee;
import com.example.project4.Repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    employeeRepository empRepo;

    @GetMapping("/new")
    public  String displayEmployee(Model model){
        Employee anEmployee = new Employee();
        model.addAttribute("employee",anEmployee);
        return "new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Model model , Employee employee){
        empRepo.save(employee);
        return "redirect:/employee/new";
    }
}

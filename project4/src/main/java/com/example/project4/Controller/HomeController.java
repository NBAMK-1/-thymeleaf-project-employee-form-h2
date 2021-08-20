package com.example.project4.Controller;

import com.example.project4.Entities.Employee;
import com.example.project4.Entities.Project;
import com.example.project4.Repository.employeeRepository;
import com.example.project4.Repository.projectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class HomeController {
    @Autowired
    projectRepository proRepo;

    @Autowired
    employeeRepository empRepo;

    @GetMapping("/home")
    public String display(Model model){
    List<Project> projects = proRepo.findAll();
    model.addAttribute("projects" ,projects);

    List<Employee> employees = empRepo.findAll();
    model.addAttribute("employeesList" ,employees);
     return "home";
    }


}

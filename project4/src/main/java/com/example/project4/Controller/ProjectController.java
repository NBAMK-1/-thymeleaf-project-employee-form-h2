package com.example.project4.Controller;

import com.example.project4.Entities.Project;
import com.example.project4.Repository.projectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    projectRepository proRepo;

    @GetMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        model.addAttribute("project",aProject);
        return "new-project";
    }

    @PostMapping("/save")
    public String createProject(Model model ,Project project){
        proRepo.save(project);
        return "redirect:/projects/new";
    }
}

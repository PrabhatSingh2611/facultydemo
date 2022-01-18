package com.facultiesProject.faculties.controllers;

import com.facultiesProject.faculties.model.Group;
import com.facultiesProject.faculties.model.Students;
import com.facultiesProject.faculties.repository.GroupRepository;
import com.facultiesProject.faculties.repository.StudentRepository;
import com.facultiesProject.faculties.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class SimpleController {

    @Value("${spring.application.name}")
    String appName;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "Home";
    }

    @GetMapping("list_marks")
    public List<Students> showListMarks( ) {
        //return studentRepository.findByStudent(id);
        return studentRepository.findAll();
    }

    @GetMapping("list_group")
    public List<Group> showListGroups( ) {
        //return studentRepository.findByStudent(id);
        return groupRepository.findAll();
    }

}

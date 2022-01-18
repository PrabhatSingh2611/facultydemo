package com.facultiesProject.faculties.controllers;

import com.facultiesProject.faculties.model.Students;
import com.facultiesProject.faculties.model.Subject;
import com.facultiesProject.faculties.repository.StudentRepository;
import com.facultiesProject.faculties.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subjects")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;
    private StudentRepository studentRepository;
    @RequestMapping("list_marks")
    public List<Subject> showListMarks(Model model) {

        return subjectRepository.findAll();
    }

    @GetMapping("/{subjectId}/students/{studentId}")
    Subject addStudentToSubject(
            @PathVariable Integer subjectId,
            @PathVariable Integer studentId
    ) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Students student = studentRepository.findById(studentId).get();
      //  subject.getStudentsEnrolled().add(student);
        return subjectRepository.save(subject);
    }
}

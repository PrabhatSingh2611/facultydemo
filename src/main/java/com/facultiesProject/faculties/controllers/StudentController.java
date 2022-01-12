package com.facultiesProject.faculties.controllers;

import com.facultiesProject.faculties.Exception.ResourceNotFoundException;
import com.facultiesProject.faculties.model.Students;
import com.facultiesProject.faculties.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//@RestController
@Controller
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    /*
    This method is for retriving all the list of students
    from database.
    input : Model
    return : index.html
     */
    @RequestMapping("list")
    public String showUpdateForm(Model model) {
     model.addAttribute("students", studentRepository.findAll());
     return "index";
   }

    @GetMapping("/students/{id}")
    public ResponseEntity<Students> getStudentById(@PathVariable(value = "id") Integer id)
    {
        Students student = studentRepository.findById(id).orElse(new Students(0,"none","none",0,0,false));
        return ResponseEntity.ok().body(student);
    }

  /*
    Adding student in the database by post
    it will go from index.html to signup mapping
    then it will call add-student.html that will fetch all students data
    and mapped to add (addStudent method) then it will call list.html
   */

    @GetMapping("signup")
    public String showSignUpForm(Students student) {
        return "add-student";
    }

    @PostMapping("add")
    public String addStudent(Students student, Model model) {
        studentRepository.save(student);
        return "redirect:list";
    }


    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") int id,Model model)
    {
        studentRepository.deleteById(id);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        Students student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        System.out.println(student);
        model.addAttribute("student", student);
        return "update-student";
    }

/*
   @PutMapping ("students/{id}")
    public  String updateEmployee (@PathVariable(value = "id")Integer studentId,
                                                          @RequestBody Students studentsDetails ) throws ResourceNotFoundException
    {
        Students students = studentRepository.findById(studentId)
                .orElseThrow(() ->  new ResourceNotFoundException( " Employee not found for this id :: "  + studentId));
        students.setAge(studentsDetails.getAge());
        students.setGender(studentsDetails.getGender());
        students.setGroupId(studentsDetails.getGroupId());
        students.setName(studentsDetails.getName());
        students.setSurname(studentsDetails.getSurname());
        System.out.println(students);
        final  Students updatedStudent = studentRepository.save(students);
        return "index";
    }
   */

    @PostMapping("update/{id}")
    public String updateStudent(@PathVariable("id") long id,Students student,
                                Model model) {
        studentRepository.save(student);
        System.out.println(student);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

}

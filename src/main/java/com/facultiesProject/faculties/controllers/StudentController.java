package com.facultiesProject.faculties.controllers;

import com.facultiesProject.faculties.Exception.ResourceNotFoundException;
import com.facultiesProject.faculties.model.Students;
import com.facultiesProject.faculties.model.Subject;
import com.facultiesProject.faculties.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@Controller
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    /*
    -----------select operation------------
     */
    /*
    This method is for retrieving all the list of students
    from database.
    input : Model
    return : index.html
     */
    @RequestMapping("list")
    public String showUpdateForm(Model model) {
     model.addAttribute("students", studentRepository.findAll());
     return "index";
   }

   /*
   This is method for fetching students by their id.
    */

    @GetMapping("/students/{id}")
    public ResponseEntity<Students> getStudentById(@PathVariable(value = "id") Integer id)
    {
        Students student = studentRepository.findById(id).orElse(new Students(0,"none","none",0,false));
        return ResponseEntity.ok().body(student);
    }
    /*
    -------------------------- Insert operation -------------
     */

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

    /*
     ---------------- Delete operation ---------------------
     */
    /*
      In index.html the delete part will handle by this method
      Param : Id of student
      return : Updated index.html
     */

    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") int id,Model model)
    {
        studentRepository.deleteById(id);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @DeleteMapping("delete1/{id}")
    public String deleteStudent1(@PathVariable(value = "id") int id,Model model)
    {
        studentRepository.deleteById(id);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    /*
     ----------------- Modify operation ----------------------
     */
    /*
       In index.html edit button will map with this function
       and in return it will go to update-student.html
       with student object
     */
    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        Students student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("student", student);
        return "update-student";
    }

  /*
   It will edit student in update-student.html
   and save into database
   return the index page
   */
   @PutMapping ("update/{id}")
   public String updateStudent(@PathVariable("id") long id,Students student,
                               Model model) {
       studentRepository.save(student);
       model.addAttribute("students", studentRepository.findAll());
       return "index";
   }



}

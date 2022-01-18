package com.facultiesProject.faculties.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity @IdClass(SubjectId.class)
@Table(name="subject")
public class Subject implements Serializable {

    @Id
    @Column(name = "subject_id", nullable = false)
    private Integer subjectId;
    @Column(name = "subject_name", nullable = false)
    private String subjectName;

    @Id
    @Column(name = "subject_marks", nullable = false)
    private Integer studentMarks;

   /*
   @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
   @JoinColumns( {
           @JoinColumn(name="subjectId", referencedColumnName="subject_id"),
           @JoinColumn(name="subjectMarks", referencedColumnName="subject_marks")
   } )*/



    public Subject(){

    }
    public Subject(Integer subjectId, String subjectName, Integer studentMarks) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.studentMarks = studentMarks;
    }

    public Integer getSubjectId() {
        return subjectId;
    }



    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }



    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }





    public Integer getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Integer studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }
}

package com.facultiesProject.faculties.dto;

public class StudSubjDto {
    private String name;
    private String surname;
    private Integer age;
    private Boolean gender;
    private String subjectName;
    private Integer subjectMarks;

    public StudSubjDto( ) {

    }

    public StudSubjDto(String name, String surname, Integer age, Boolean gender, String subjectName, Integer subjectMarks) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.subjectName = subjectName;
        this.subjectMarks = subjectMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(Integer subjectMarks) {
        this.subjectMarks = subjectMarks;
    }
}

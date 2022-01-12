package com.facultiesProject.faculties.model;



import javax.persistence.*;

@Entity
@Table(name="Students")
public class Students {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private Integer GroupId;
    private Boolean Gender;

    public Students(){

    }
    public Students(Integer id, String name, String surname, Integer age, Integer groupId, Boolean gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        GroupId = groupId;
        Gender = gender;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "surname", nullable = false)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "age", nullable = false)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "groupid", nullable = false)
    public Integer getGroupId() {
        return GroupId;
    }

    public void setGroupId(Integer groupId) {
        GroupId = groupId;
    }

    @Column(name = "gender", nullable = false)
    public Boolean getGender() {
        return Gender;
    }

    public void setGender(Boolean gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", GroupId=" + GroupId +
                ", Gender=" + Gender +
                '}';
    }
}

package com.facultiesProject.faculties.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id", nullable = false)
    private Integer groupId;


    @ManyToOne
    @JoinColumn(name="dept_id", nullable=false)
    private Department department;

    public Group(){

    }
    public Group(Integer groupId) {
        this.groupId = groupId;

    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

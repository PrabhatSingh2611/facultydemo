package com.facultiesProject.faculties.model;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Department {
    private Integer deptId;
    private String deptName;

    public Department(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getDeptId() {
        return deptId;
    }

    @Column(name = "DeptName", nullable = false)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

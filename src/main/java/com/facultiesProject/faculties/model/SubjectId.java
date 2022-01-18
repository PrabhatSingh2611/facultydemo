package com.facultiesProject.faculties.model;

import java.io.Serializable;

public class SubjectId implements Serializable {
    Integer subjectId;
    Integer studentMarks;

    public SubjectId(){

    }
    public SubjectId(Integer subjectId, Integer studentMarks) {
        this.subjectId = subjectId;
        this.studentMarks = studentMarks;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Integer studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectId subjectId1 = (SubjectId) o;

        if (subjectId != null ? !subjectId.equals(subjectId1.subjectId) : subjectId1.subjectId != null) return false;
        return studentMarks != null ? studentMarks.equals(subjectId1.studentMarks) : subjectId1.studentMarks == null;
    }

    @Override
    public int hashCode() {
        int result = subjectId != null ? subjectId.hashCode() : 0;
        result = 31 * result + (studentMarks != null ? studentMarks.hashCode() : 0);
        return result;
    }
}

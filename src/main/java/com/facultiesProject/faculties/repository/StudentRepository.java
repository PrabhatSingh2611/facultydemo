package com.facultiesProject.faculties.repository;

import com.facultiesProject.faculties.dto.StudSubjDto;
import com.facultiesProject.faculties.model.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {
   /*
   @Query("SELECT new com.facultiesProject.faculties.dto(d.name, d.surname,d.age,d.Gender,e.subjectName,subjectMarks) "
           + "FROM Students d INNER JOIN d.subjectSet e")
   List<StudSubjDto> fetchStudSubjDataInnerJoin();

    */
}

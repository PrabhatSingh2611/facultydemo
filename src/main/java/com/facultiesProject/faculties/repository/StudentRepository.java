package com.facultiesProject.faculties.repository;

import com.facultiesProject.faculties.model.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {

}

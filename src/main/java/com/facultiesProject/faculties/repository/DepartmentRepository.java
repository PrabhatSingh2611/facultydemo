package com.facultiesProject.faculties.repository;

import com.facultiesProject.faculties.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository <Department,Integer>{

}

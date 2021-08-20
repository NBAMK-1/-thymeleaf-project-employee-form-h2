package com.example.project4.Repository;

import com.example.project4.Entities.Employee;
import com.example.project4.Entities.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface employeeRepository extends CrudRepository<Employee,Long> {
    @Override
  public   List<Employee> findAll();
}

package com.example.project4.Repository;

import com.example.project4.Entities.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface projectRepository extends CrudRepository<Project,Long> {
    @Override
   public  List<Project> findAll();
}

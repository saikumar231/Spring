package com.codegnan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegnan.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
	
}
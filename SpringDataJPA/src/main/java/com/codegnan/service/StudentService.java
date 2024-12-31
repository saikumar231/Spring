package com.codegnan.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.Exception.InvalidStudentIdException;
import com.codegnan.entity.Student;
import com.codegnan.repo.StudentRepo;

@Service
public class StudentService {
private StudentRepo studentRepo;

@Autowired
public void setStudentRepo(StudentRepo studentRepo) {
	this.studentRepo = studentRepo;
}


//method to save a student
public Student saveStudent(Student student) {
	Student saved=studentRepo.save(student);
	return saved;
}

// method to find a student by id:

public Student findStudentById(int id)throws InvalidStudentIdException {
	Optional<Student> optstudent = studentRepo.findById(id);
	if (!optstudent.isPresent()) {
		throw new InvalidStudentIdException("Student Id" + id + "Not Available");
	}
	return optstudent.get();
}

//method to findall a student by id:

public List<Student>findAllStudents(){
	return studentRepo.findAll(); 
}
//method to edit a student by id:

public Student edit(Student student) throws InvalidStudentIdException {
	findStudentById(student.getId());
	return studentRepo.save(student);
}
//method to update or delete a student by id:
public Student deleteStudent(int id) throws InvalidStudentIdException {
	Student student = findStudentById(id);
	studentRepo.deleteById(id);
	return student;
	
}
}
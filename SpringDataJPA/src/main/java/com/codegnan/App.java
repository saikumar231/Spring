package com.codegnan;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegnan.Exception.InvalidStudentIdException;
import com.codegnan.entity.Student;
import com.codegnan.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
       StudentService studentService=context.getBean(StudentService.class);
       
       Student student1=new Student("kishore","kishore@gmalicom");
       Student student2=new Student("sravani","sravani@gmalicom");
       Student student3=new Student("abhi","abhi@gmalicom");
       Student student4=new Student("raji","raji@gmalicom");
       Student student5=new Student("rama","rama@gmalicom");
       
       studentService.saveStudent(student1);
       studentService.saveStudent(student2);
       studentService.saveStudent(student3);
       studentService.saveStudent(student4);
       studentService.saveStudent(student5);
       
       try {
    	   Student student =studentService.findStudentById(1);
    	   System.out.println(student);
       }catch(InvalidStudentIdException e) {
    	   System.out.println(e.getMessage());
       }
       
       
     /*  List<Student>students = studentService.findAllStudents();
       for(Student student:students) {
    	   System.out.println(student);
       }*/
       
       try {
    	   Student student =studentService.findStudentById(1);
    	   student.setName("codegnan");
    	   student.setEmail("codegnan@gmail.com");
    	   studentService.edit(student);
    	   System.out.println("Student updated Successfully");
       }catch(InvalidStudentIdException e) {
    	   e.printStackTrace();
    	   
       }
       
       try {
    	   Student deletedStudent=studentService.deleteStudent(1);
    	   System.out.println("Student deleted Successfully"+deletedStudent);
       }catch(InvalidStudentIdException e) {
    	   System.out.println(e.getMessage());
    	   
       }
       
       List<Student>students = studentService.findAllStudents();
       for(Student student:students) {
    	   System.out.println(student);
       }
       
    }
}
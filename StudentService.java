package com.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Student;
import com.demo.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository sr;
	
	public Student addStudent(Student s) {
		return sr.save(s);
	}
	
	public Student findBySid(int sid) {
		return sr.findBySid(sid);
	}
	
	public List<Student> findBySnameContains(String sname){
		return sr.findBySnameContains(sname);
	}
	
	public int deleteStudentBySid(int sid) {
		return sr.deleteBySid(sid);
	} 
	
	
	public List<Student> findAllStudent(){
		return sr.findAll();
	} 
	
}

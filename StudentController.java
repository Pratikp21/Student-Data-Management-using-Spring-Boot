package com.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@GetMapping(value = "/findbyname/{name}")
	public List<Student> m1(@PathVariable("name")String sname){
		return ss.findBySnameContains(sname);
	}  
	
	@GetMapping(value = "/findbyid/{id}")
	public Student m2(@PathVariable("id")int sid) {
		return ss.findBySid(sid);
	}
	
	@PostMapping(value = "/add")
	public Student m3(@RequestBody Student s){
		return ss.addStudent(s);
	}
	
	@DeleteMapping(value = "/deletebyid/{id}")
	public int m4(@PathVariable("id")int sid) {
		return ss.deleteStudentBySid(sid);
	} 
	
	
	@PutMapping(value = "/update")
	public Student m5(@RequestBody Student s) {
		return ss.addStudent(s);
	}
	
	@GetMapping(value = "/displayall")
	public List<Student> m6(){
		return ss.findAllStudent();
	} 
/*	@GetMapping(value = "findbyname/{name}")
	public List<Student> m3(@PathVariable("name")String sname){
		return ss.findBySnameContains(sname);
		
	} */

}

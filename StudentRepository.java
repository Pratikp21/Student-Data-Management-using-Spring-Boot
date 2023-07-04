package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findBySid(int sid);

	List<Student> findBySnameContains(String sname);
	
	int deleteBySid(int sid);
}

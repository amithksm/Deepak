package com.example.studentdemo.demo.controller;

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

import com.example.studentdemo.demo.dto.ClassDTO;
import com.example.studentdemo.demo.dto.StudentDTO;
import com.example.studentdemo.demo.entity.StudentEntity;
import com.example.studentdemo.demo.service.StudentService;

import io.swagger.annotations.Api;

@RestController
@Api
@RequestMapping("api")
public class InputController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("students")
	public void saveStudent(@RequestBody StudentDTO student) {
		
		studentService.saveStudent(student);
		
	}
	
	@PutMapping("students/student/{id}")
	public String saveStudentPut(@RequestBody StudentDTO student, @PathVariable String id) {
		
		return studentService.saveStudentPut(student, id);
		
	}
	
	@GetMapping("students")
	public List<StudentEntity> getAll() {
		
		return studentService.getAll();
		
	}
	
	@GetMapping("students/student/{id}")
	public StudentEntity getStudent(@PathVariable("id") String id) {
		
		return studentService.get(id);
		
	}
	
	@DeleteMapping("students/student/{id}")
	public String deleteStudent(@PathVariable("id") String id) {
		
		return studentService.delete(id);
		
	}
	

}

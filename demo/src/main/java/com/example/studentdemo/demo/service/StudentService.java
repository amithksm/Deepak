package com.example.studentdemo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdemo.demo.dto.ClassDTO;
import com.example.studentdemo.demo.dto.StudentDTO;
import com.example.studentdemo.demo.entity.BatchEntity;
import com.example.studentdemo.demo.entity.ClassEntity;
import com.example.studentdemo.demo.entity.StudentEntity;
import com.example.studentdemo.demo.repo.IStudentClass;
import com.example.studentdemo.demo.repo.IStudentRep;

@Service
public class StudentService {
	
	@Autowired 
	IStudentRep studentRepo;
	
	@Autowired
	IStudentClass studentClassRepo;
	
	public String saveStudent(StudentDTO student) {
		
		StudentEntity studentEntity = new StudentEntity();
		
		BatchEntity batch = new BatchEntity();
		ClassEntity ce = new ClassEntity();
		ce.setStudentClass(student.getStudentClass());
		
		
		batch.setBatch(student.getBatch());
		studentEntity.setBatch(batch);
		studentEntity.setfName(student.getfName());
		studentEntity.setStudentClass(ce);
		
		
		
		studentClassRepo.save(ce);
		studentRepo.save(studentEntity);
		return "Student Created";
	}

	public List<StudentEntity> getAll() {
		List<StudentEntity> list = studentRepo.findAll();
		return studentRepo.findAll();
	}

	public String saveStudentPut(StudentDTO student, String id) {
		
		Optional<StudentEntity> so = studentRepo.findById(id);
		
		if(!so.isPresent()) {
			return "Student not found";
		}
		
		StudentEntity se = so.get();
		BatchEntity batch = new BatchEntity();
		ClassEntity ce = new ClassEntity();
		ce.setStudentClass(student.getStudentClass());
		
		
		batch.setBatch(student.getBatch());
		se.setBatch(batch);
		se.setfName(student.getfName());
		se.setStudentClass(ce);
		
		studentClassRepo.save(ce);
		studentRepo.save(se);
		
		return "Student Updated";
		
	}

	public StudentEntity get(String id) {
		
		return studentRepo.findByStudentId(id);
	}

	public String delete(String id) {
		
		Optional<StudentEntity> so = studentRepo.findById(id);
		
		if(!so.isPresent()) {
			return "Student not found";
		}
		StudentEntity se = so.get();
		studentRepo.delete(se);
		
		return se.getfName() + " deleted";
		
	}

}

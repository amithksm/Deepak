package com.example.studentdemo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdemo.demo.entity.ClassEntity;
import com.example.studentdemo.demo.repo.IStudentClass;

@Service
public class ClassService {
	
	@Autowired
	IStudentClass studentClassRepo;

	public void saveClass(ClassEntity ce) {
		
		studentClassRepo.save(ce);
	}
	
}

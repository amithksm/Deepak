package com.example.studentdemo.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.studentdemo.demo.entity.StudentEntity;

@Repository
public interface IStudentRep extends MongoRepository<StudentEntity, String>{
	
	StudentEntity findByStudentId(String id);
}

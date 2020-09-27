package com.example.studentdemo.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.studentdemo.demo.entity.ClassEntity;

@Repository
public interface IStudentClass extends MongoRepository<ClassEntity, String> {

}

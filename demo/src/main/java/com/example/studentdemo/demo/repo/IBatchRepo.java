package com.example.studentdemo.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.studentdemo.demo.entity.BatchEntity;

@Repository
public interface IBatchRepo extends MongoRepository<BatchEntity, String> {

}

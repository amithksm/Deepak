package com.example.studentdemo.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StudentsTable")
public class StudentEntity {
	
	@Id
	private String studentId;
	private String fName;
	
	
	private BatchEntity batch;
	
	@DBRef
	private ClassEntity studentClass;
	
	
	public ClassEntity getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(ClassEntity studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public BatchEntity getBatch() {
		return batch;
	}
	public void setBatch(BatchEntity batch) {
		this.batch = batch;
	}
	
}

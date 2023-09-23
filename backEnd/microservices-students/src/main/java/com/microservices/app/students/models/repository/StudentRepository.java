package com.microservices.app.students.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservices.app.students.models.entity.Student;

public interface StudentRepository extends CrudRepository <Student, Long> {

}

package com.microservices.app.students.services;

import org.springframework.stereotype.Service;

import com.microservices.app.students.models.entity.Student;
import com.microservices.app.students.models.repository.StudentRepository;
import com.microservices.commons.services.CommonServiceImpl;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student, StudentRepository> implements StudentService {



}

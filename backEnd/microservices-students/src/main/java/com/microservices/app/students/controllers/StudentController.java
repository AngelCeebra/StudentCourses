package com.microservices.app.students.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.app.students.models.entity.Student;
import com.microservices.app.students.services.StudentService;
import com.microservices.commons.controllers.CommonController;

@RestController
public class StudentController extends CommonController<Student, StudentService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@RequestBody Student student, @PathVariable Long id) {
		Optional<Student> o = service.findById(id);
		
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Student studentDb = o.get();
		studentDb.setFirstName(student.getFirstName());
		studentDb.setLastName(student.getLastName());
		studentDb.setEmail(student.getEmail());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(studentDb));
	}
	
}

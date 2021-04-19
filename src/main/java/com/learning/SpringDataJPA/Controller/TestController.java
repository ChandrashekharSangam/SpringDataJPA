package com.learning.SpringDataJPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringDataJPA.Entity.Employee;
import com.learning.SpringDataJPA.Repository.EmployeeRepository;

@RestController
public class TestController {

	@Autowired
	EmployeeRepository empRepo;

	@GetMapping("/hi")
	public ResponseEntity<String> testRestApi() {

		return new ResponseEntity<String>("Hello From Spring!!", HttpStatus.OK);
	}

	@PostMapping("/saveEmployeeRecord")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {
		System.out.println("Here to save the record");
		empRepo.save(emp);

		return new ResponseEntity<>("Success", HttpStatus.OK);

	}
}

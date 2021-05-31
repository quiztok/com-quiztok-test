package com.quiztok.comquiztoktest.test.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiztok.comquiztoktest.test.model.Test;
import com.quiztok.comquiztoktest.test.service.TestService;

@RestController
@RequestMapping({"/test", "/v1/test"})
public class TestRest {
	
	private final TestService service;
	
	public TestRest(final TestService service) {
		this.service = service;
	}
	
	//CRUD
	@PostMapping
	public ResponseEntity<Test> add(@RequestBody Test test) {
		service.add(test);
		return null;
	}
	
	@PutMapping
	public void eidt() {
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Test> remove(@PathVariable String id) {
		return null;
	}
	
	@GetMapping
	public void list() {
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Test> get(@PathVariable String id) {
		return new ResponseEntity<Test>(service.get(id), HttpStatus.OK);
	}
}

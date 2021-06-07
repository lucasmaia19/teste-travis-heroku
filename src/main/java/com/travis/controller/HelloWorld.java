package com.travis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Olás-enfermeira")
public class HelloWorld {

	@GetMapping
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello World, i'am alive and kicking!!");
	}
}

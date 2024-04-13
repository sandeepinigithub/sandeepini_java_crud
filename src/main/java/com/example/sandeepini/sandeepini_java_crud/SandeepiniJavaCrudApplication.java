package com.example.sandeepini.sandeepini_java_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SandeepiniJavaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandeepiniJavaCrudApplication.class, args);
	}

	@GetMapping(value = "/userDetail", produces = "application/json")
	public UserData userDetail() {
		UserData data = new UserData(1, "Sandeep Kumar Shukla", "Shekhar");
		return data;
	}
}

//Model Class Writing Here 
class UserData {
	public int id;
	public String name;
	public String friend;

//	Constructor Function 
	UserData(int id, String name, String friend) {
		this.id = id;
		this.name = name;
		this.friend = friend;

	}
}

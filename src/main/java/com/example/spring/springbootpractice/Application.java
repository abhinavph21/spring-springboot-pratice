package com.example.spring.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(
		scanBasePackages = "com/example/spring/springbootpractice/Bean_02"
)
@RestController
public class Application {

//	@Value("${username}")
//	private String username;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@GetMapping("/")
//	public String getRequest(){
//		return "get api called by "+username;
//	}
}

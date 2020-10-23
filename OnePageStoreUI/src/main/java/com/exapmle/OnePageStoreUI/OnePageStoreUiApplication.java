package com.exapmle.OnePageStoreUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class OnePageStoreUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnePageStoreUiApplication.class, args);
	}
	
	@GetMapping("/QQ")
	public String test() {
		return "QQ" ;
	}

}

package com.lombokeg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokegApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LombokegApplication.class, args);
		
		Student st = new Student();
		st.setName("pankaj");
		System.out.println(st.getName());
		
		
		
	}

}

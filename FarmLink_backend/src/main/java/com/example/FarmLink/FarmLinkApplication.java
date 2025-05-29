package com.example.FarmLink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.FarmLink.entities")
public class FarmLinkApplication {


	public static void main(String[] args) {

		SpringApplication.run(FarmLinkApplication.class, args);
	}


}


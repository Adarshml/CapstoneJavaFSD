package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.mAadhar.bean")
@EnableJpaRepositories(basePackages = "com.mAadhar.repository")
public class MAadharbackendAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MAadharbackendAppApplication.class, args);
		System.out.println("Server Running on 9191");
	}

}

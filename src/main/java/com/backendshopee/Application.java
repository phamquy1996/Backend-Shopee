package com.backendshopee;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.backendshopee.controller.FileUploadController;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })

public class Application {
	
	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
        SpringApplication.run(Application.class, args);
    }
}

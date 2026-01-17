package com.example.excel;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class ExcelBootDemoApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(ExcelBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting done !!");
	}

}

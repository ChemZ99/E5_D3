package Exercises.E5_D3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class E5D3Application {

	public static void main(String[] args) {
		SpringApplication.run(E5D3Application.class, args);

	}

	public static void configurationClass() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(E5D3Application.class);
	}

}


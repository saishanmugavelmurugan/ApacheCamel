package com.shan.camel;

import org.apache.camel.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(CamelApplication.class, args);
//
//	}

	public static void main(String[] args) throws Exception {
		// use Camels Main class
		Main main = new Main(CamelApplication.class);
		// now keep the application running until the JVM is terminated (ctrl + c or sigterm)
		main.run(args);
	}


}

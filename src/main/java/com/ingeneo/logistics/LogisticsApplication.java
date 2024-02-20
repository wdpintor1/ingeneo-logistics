package com.ingeneo.logistics;

import ch.qos.logback.core.CoreConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogisticsApplication {

	public static void main(String[] args) {
            System.out.println("hola mi amorsito");
		SpringApplication.run(LogisticsApplication.class, args);
	}

}

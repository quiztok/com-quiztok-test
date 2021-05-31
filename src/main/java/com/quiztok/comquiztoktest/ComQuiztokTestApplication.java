package com.quiztok.comquiztoktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${profile:dev}.properties")
public class ComQuiztokTestApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ComQuiztokTestApplication.class, args);
		SpringApplication springApplication = new SpringApplication(ComQuiztokTestApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("test.pid"));
		springApplication.run(args);
	}

}


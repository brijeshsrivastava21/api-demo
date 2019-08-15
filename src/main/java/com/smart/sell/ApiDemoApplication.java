package com.smart.sell;





import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.smart.sell"})
public class ApiDemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

}

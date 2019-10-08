package young.tyler.SpringBootWebAppExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//https://www.codejava.net/frameworks/spring-boot/how-to-create-a-spring-boot-web-application-spring-mvc-with-jsp-thymeleaf
//
//Two default directories and one properties file in the src/main/resources folder 
//
//static: put your static files here, e.g. HTML files.
//templates: put your template files here, e.g. ThymeLeaf files.
//application.properties: specify additional configurations here, e.g. logging, Spring MVC view resolver, server port number, etc.


//@SpringBootApplication starts the embedded Tomcat server, configure Spring Dispatcher Servlet,etc.
//default: http://localhost:8080/
//
//server.port=80
//server.servlet.context-path=/ContactApp
//
//http://localhost/ContactApp/list_contact


@SpringBootApplication
public class SpringBootWebAppExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppExampleApplication.class, args);
	}

}

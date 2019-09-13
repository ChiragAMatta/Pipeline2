package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*
* @SpringBootApplication is the combination of the following 3 annotations:
* @EnableAutoConfiguration: Spring Boot'l auto-configuration mechanism
* -@ComponentScan: scans packages for annotations
* -@Configuration: allows you to register your beans
*
* */
@SpringBootApplication
public class PolkaBootApplication extends SpringBootServletInitializer{
    
    /*
     * What is spring boot/ why is it helpful?
     * -Spring BOot is a spring boot project in the SPeing Ecosystem
     * -It is built on Spring Framework
     * -Makes Everything easier(technically an opinion..but cmon)
     * -embedded tomcat server(dont have to deploy war files)
     * -dev tools and health metrics
     * -Spring Boot starter project "bootstraping"
     * -no xml configuration
     *
     * Opinionated configuration
     * -Takes and "opinionated" view so that you can get started faster
     * -
     * */
    public static void main(String[] args) {
        SpringApplication.run(PolkaBootApplication.class, args);
    }
    
     @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(PolkaBootApplicationClass);
        }
        private static Class<PolkaBootApplication> PolkaBootApplicationClass = PolkaBootApplication.class;
    }
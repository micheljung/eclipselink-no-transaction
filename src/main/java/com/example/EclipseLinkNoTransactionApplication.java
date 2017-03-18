package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EclipseLinkNoTransactionApplication {

  public static void main(String[] args) throws Exception {
    ConfigurableApplicationContext context = SpringApplication.run(EclipseLinkNoTransactionApplication.class, args);

    context.getBean(GreetingService.class).saveGreeting("Hello");
  }
}

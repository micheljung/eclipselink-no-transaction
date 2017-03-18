package com.example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GreetingService {

  private final GreetingRepository greetingRepository;

  public GreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Transactional
  public void saveGreeting(String greeting) {
    Greeting save = greetingRepository.save(new Greeting(greeting));
    System.out.println("ID of saved entity: "+save.getId());
  }
}

package com.km.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HTTPHandler {

  @GetMapping("/find/{id}")
  public String findById(@PathVariable String id) {
    return "Received " + id;
  }

  @GetMapping("/")
  public String homePage() { return "Hello World";}
}
